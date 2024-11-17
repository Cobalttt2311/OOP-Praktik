import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AdvancedFoodOrderApp {

    // Informasi Toko
    private static final String STORE_NAME = "Cafe Delicious Corner";
    private static final String STORE_ADDRESS = "Jl. Kenangan No. 99, Bandung";
    private static final String STORE_PHONE = "0812-3456-7890";

    // Nomor pesanan dan tanggal terakhir transaksi
    private static int orderNumber = 1;
    private static LocalDate lastOrderDate = LocalDate.now();

    public static void main(String[] args) {
        // Frame Utama
        JFrame frame = new JFrame("Aplikasi Pemesanan Makanan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Panel Data Customer
        JPanel customerPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        customerPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.DARK_GRAY), "Data Customer"));
        customerPanel.setBackground(new Color(230, 230, 250));
        customerPanel.add(new JLabel("Nama:"));
        JTextField nameField = new JTextField(15);
        customerPanel.add(nameField);

        customerPanel.add(new JLabel("Alamat:"));
        JTextField addressField = new JTextField(15);
        customerPanel.add(addressField);

        customerPanel.add(new JLabel("No Telp:"));
        JTextField phoneField = new JTextField(15);
        customerPanel.add(phoneField);

        customerPanel.add(new JLabel("Nama Kasir:"));
        JComboBox<String> cashierComboBox = new JComboBox<>(new String[] {"Nalendra", "Praja"});
        customerPanel.add(cashierComboBox);

        // Panel Pilih Menu dengan Sub-menu
        JPanel menuPanel = new JPanel(new GridLayout(5, 1, 5, 5));
        menuPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.DARK_GRAY), "Pilih Menu dan Varian"));
        menuPanel.setBackground(new Color(240, 248, 255));

        // Membuat panel menu
        JPanel steakPanel = createMenuPanel("Steak", new String[] {"Original", "Blackpepper", "BBQ"}, 50000);
        JPanel spaghettiPanel = createMenuPanel("Spageti", new String[] {"Bolognese", "Carbonara", "Marinara"}, 40000);
        JPanel pizzaPanel = createMenuPanel("Pizza", new String[] {"Margherita", "Pepperoni", "Veggie"}, 80000);
        JPanel burgerPanel = createMenuPanel("Burger", new String[] {"Cheese", "Chicken", "Beef"}, 30000);
        JPanel drinkPanel = createMenuPanel("Minuman", new String[] {"Air Mineral", "Teh", "Kopi"}, 10000);

        // Menambahkan ke panel menu
        menuPanel.add(steakPanel);
        menuPanel.add(spaghettiPanel);
        menuPanel.add(pizzaPanel);
        menuPanel.add(burgerPanel);
        menuPanel.add(drinkPanel);

        // Panel Total Bayar
        JPanel totalPanel = new JPanel(new GridLayout(1, 2));
        JLabel totalLabel = new JLabel("TOTAL BAYAR:");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 16));
        totalPanel.add(totalLabel);
        JTextField totalField = new JTextField("0", 10);
        totalField.setEditable(false);
        totalField.setBackground(Color.BLACK);
        totalField.setForeground(Color.YELLOW);
        totalField.setFont(new Font("Arial", Font.BOLD, 20));
        totalField.setHorizontalAlignment(JTextField.CENTER);
        totalPanel.add(totalField);

        // Panel Pesanan
        JTextArea orderArea = new JTextArea(10, 40);
        orderArea.setEditable(false);
        orderArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        orderArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(orderArea);

        // Daftar untuk menyimpan semua pesanan
        List<OrderItem> orders = new ArrayList<>();
        int[] total = {0}; // Array digunakan untuk memungkinkan modifikasi nilai di dalam ActionListener

        // Tombol Tambah
        JButton addButton = new JButton("TAMBAH");
        addButton.setBackground(new Color(34, 139, 34));
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font("Arial", Font.BOLD, 16));
        addButton.setFocusPainted(false);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset order number if the date has changed
                LocalDate currentDate = LocalDate.now();
                if (!currentDate.equals(lastOrderDate)) {
                    lastOrderDate = currentDate;
                    orderNumber = 1;
                }

                // Menangani setiap panel menu
                for (JPanel panel : new JPanel[]{steakPanel, spaghettiPanel, pizzaPanel, burgerPanel, drinkPanel}) {
                    JCheckBox checkBox = (JCheckBox) panel.getClientProperty("checkBox");
                    JComboBox<String> variantComboBox = (JComboBox<String>) panel.getClientProperty("variantComboBox");
                    JTextField quantityField = (JTextField) panel.getClientProperty("quantityField");
                    int price = (int) panel.getClientProperty("price");

                    if (checkBox.isSelected()) {
                        try {
                            int quantity = Integer.parseInt(quantityField.getText().trim());
                            if (quantity > 0 && quantity <= 6) {
                                String itemName = checkBox.getText();
                                String variant = (String) variantComboBox.getSelectedItem();
                                boolean itemExists = false;

                                // Update existing order item if exists
                                for (OrderItem orderItem : orders) {
                                    if (orderItem.getItemName().equals(itemName) && orderItem.getVariant().equals(variant)) {
                                        orderItem.addQuantity(quantity);
                                        itemExists = true;
                                        break;
                                    }
                                }

                                // Add new order item if it doesn't exist
                                if (!itemExists) {
                                    orders.add(new OrderItem(itemName, variant, quantity, price));
                                }

                                total[0] += price * quantity;
                            } else {
                                JOptionPane.showMessageDialog(frame, "Jumlah maksimum untuk " + checkBox.getText() + " adalah 6.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frame, "Masukkan jumlah valid untuk " + checkBox.getText(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }

                // Menampilkan pesanan di area pesanan
                double tax = total[0] * 0.11;
                double grandTotal = total[0] + tax;

                StringBuilder order = new StringBuilder();
                order.append("Nomor Pesanan: ").append(orderNumber).append("\n");
                order.append("Tanggal: ").append(currentDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"))).append("\n");
                order.append("Nama: ").append(nameField.getText()).append("\n");
                order.append("Alamat: ").append(addressField.getText()).append("\n");
                order.append("Telp: ").append(phoneField.getText()).append("\n");
                order.append("Kasir: ").append(cashierComboBox.getSelectedItem()).append("\n");
                order.append("-----------------------------\n");
                order.append("Pesanan:\n");

                for (OrderItem orderItem : orders) {
                    order.append(orderItem.toString()).append("\n");
                }
                order.append("-----------------------------\n");
                order.append(String.format("Subtotal: Rp. %,d\n", total[0]));
                order.append(String.format("Pajak (11%%): Rp. %,d\n", (int) tax));
                order.append(String.format("Total Bayar: Rp. %,d\n", (int) grandTotal));

                totalField.setText(String.format("%,d", (int) grandTotal));
                orderArea.setText(order.toString());
            }
        });

        // Tombol Edit atau Hapus Pesanan Spesifik
        JButton editDeleteButton = new JButton("EDIT/HAPUS PESANAN");
        editDeleteButton.setBackground(new Color(255, 165, 0));
        editDeleteButton.setForeground(Color.WHITE);
        editDeleteButton.setFont(new Font("Arial", Font.BOLD, 16));
        editDeleteButton.setFocusPainted(false);
        editDeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] itemsArray = new String[orders.size()];
                for (int i = 0; i < orders.size(); i++) {
                    itemsArray[i] = orders.get(i).toString();
                }

                String itemToEdit = (String) JOptionPane.showInputDialog(frame, "Pilih pesanan yang ingin diedit atau dihapus:", "Edit/Hapus Pesanan",
                        JOptionPane.QUESTION_MESSAGE, null, itemsArray, itemsArray[0]);

                if (itemToEdit != null) {
                    OrderItem itemFound = null;
                    for (OrderItem item : orders) {
                        if (item.toString().equals(itemToEdit)) {
                            itemFound = item;
                            break;
                        }
                    }
                    if (itemFound != null) {
                        String[] options = {"Edit", "Hapus"};
                        int choice = JOptionPane.showOptionDialog(frame, "Apa yang ingin Anda lakukan?", "Edit atau Hapus",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                        if (choice == 0) { // Edit
                            String newQuantityStr = JOptionPane.showInputDialog(frame, "Masukkan jumlah baru untuk " + itemFound.getItemName() + " (Varian: " + itemFound.getVariant() + "):", itemFound.getQuantity());
                            try {
                                int newQuantity = Integer.parseInt(newQuantityStr);
                                if (newQuantity > 0 && newQuantity <= 6) {
                                    total[0] -= itemFound.getPrice() * itemFound.getQuantity();
                                    itemFound.setQuantity(newQuantity);
                                    total[0] += itemFound.getPrice() * newQuantity;
                                    addButton.doClick();
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Jumlah maksimum untuk " + itemFound.getItemName() + " adalah 6.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                                }
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(frame, "Masukkan jumlah valid.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else if (choice == 1) { // Hapus
                            total[0] -= itemFound.getPrice() * itemFound.getQuantity();
                            orders.remove(itemFound);
                            addButton.doClick();
                        }
                    }
                }
            }
        });

        // Tombol Simpan Transaksi dengan Print
        JButton saveButton = new JButton("SIMPAN & PRINT TRANSAKSI");
        saveButton.setBackground(new Color(0, 102, 204));
        saveButton.setForeground(Color.WHITE);
        saveButton.setFont(new Font("Arial", Font.BOLD, 16));
        saveButton.setFocusPainted(false);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String fileName = "transaksi_" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + "_" + orderNumber + ".txt";
                    File file = new File(fileName);
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                        // Menulis informasi toko ke dalam file transaksi
                        writer.write(STORE_NAME + "\n");
                        writer.write(STORE_ADDRESS + "\n");
                        writer.write("Telp: " + STORE_PHONE + "\n");
                        writer.write("=========================================\n");

                        // Menulis waktu pemesanan
                        String currentTime = java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"));
                        writer.write("Waktu Pemesanan: " + currentTime + System.lineSeparator());
                        writer.write(orderArea.getText());
                        writer.write("\nTerima kasih atas pesanan Anda!\n");
                        writer.write("\n=========================================\n");
                    }

                    JOptionPane.showMessageDialog(frame, "Transaksi berhasil disimpan dan siap untuk dicetak!", "Info", JOptionPane.INFORMATION_MESSAGE);

                    // Print waktu pemesanan
                    System.out.println("Waktu Pemesanan: " + java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));

                    // Increment order number after saving transaction
                    orderNumber++;
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Terjadi kesalahan saat menyimpan transaksi.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Mengatur Layout Frame
        JPanel topPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        topPanel.add(customerPanel);
        topPanel.add(menuPanel);
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.add(addButton);
        buttonPanel.add(editDeleteButton);
        buttonPanel.add(saveButton);

        // Panel Total Bayar ditempatkan di bagian bawah
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(totalPanel, BorderLayout.NORTH);
        bottomPanel.add(scrollPane, BorderLayout.CENTER);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Menempatkan Frame di Tengah
        frame.setLocationRelativeTo(null);

        // Menampilkan Frame
        frame.setVisible(true);
    }

    // Fungsi untuk membuat panel menu dengan jumlah
    private static JPanel createMenuPanel(String itemName, String[] variants, int price) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JCheckBox checkBox = new JCheckBox(itemName);
        JComboBox<String> variantComboBox = new JComboBox<>(variants);
        JTextField quantityField = new JTextField("1", 2); // Quantity input
        panel.add(checkBox);
        panel.add(variantComboBox);
        panel.add(new JLabel("Qty:"));
        panel.add(quantityField);
        panel.putClientProperty("checkBox", checkBox);
        panel.putClientProperty("variantComboBox", variantComboBox);
        panel.putClientProperty("quantityField", quantityField);
        panel.putClientProperty("price", price);
        return panel;
    }

    // Kelas untuk menyimpan informasi pesanan
    static class OrderItem {
        private String itemName;
        private String variant;
        private int quantity;
        private int price;

        public OrderItem(String itemName, String variant, int quantity, int price) {
            this.itemName = itemName;
            this.variant = variant;
            this.quantity = quantity;
            this.price = price;
        }

        public String getItemName() {
            return itemName;
        }

        public String getVariant() {
            return variant;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getPrice() {
            return price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void addQuantity(int quantity) {
            this.quantity += quantity;
        }

        @Override
        public String toString() {
            return "~ " + itemName + " (Varian: " + variant + ") x" + quantity + " - Rp. " + (price * quantity);
        }
    }
}
