import com.jtk.akademik.orang.*;

public class Akademik {
    public static void main(String[] args) {
        // Data Mahasiswa
        Mahasiswa[] mhs = new Mahasiswa[10];
        mhs[0] = new Mahasiswa("Muammar", 19, "Laki-laki", "231511052", "Teknik Informatika", "4");
        mhs[1] = new Mahasiswa("Hanif", 19, "Laki-laki", "231511053", "Teknik Informatika", "4");
        mhs[2] = new Mahasiswa("Azka", 19, "Laki-laki", "231511054", "Teknik Informatika", "4");
        mhs[3] = new Mahasiswa("Ilham", 19, "Laki-laki", "231511055", "Teknik Informatika", "4");
        mhs[4] = new Mahasiswa("Fauzan", 19, "Laki-laki", "231511056", "Teknik Informatika", "4");
        mhs[5] = new Mahasiswa("Nanda", 19, "Laki-laki", "231511057", "Teknik Informatika", "4");
        mhs[6] = new Mahasiswa("Ghani", 19, "Laki-laki", "231511058", "Teknik Informatika", "4");
        mhs[7] = new Mahasiswa("Alya", 19, "Perempuan", "231511059", "Teknik Informatika", "4");
        mhs[8] = new Mahasiswa("Nabila", 19, "Perempuan", "231511060", "Teknik Informatika", "4");
        mhs[9] = new Mahasiswa("Lendra", 19, "Laki-laki", "231511061", "Teknik Informatika", "4");

        // Cetak data mahasiswa
        System.out.println("Data Mahasiswa:");
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Nama: " + mhs[i].getName() + 
                            
                               ", Jenis Kelamin: " + mhs[i].getGender() + 
                               ", NIM: " + mhs[i].getNIM() + 
                               ", Jurusan: " + mhs[i].getProdi() + 
                               ", Semester: " + mhs[i].getSemester());
        }
        System.out.println();

        // Data Dosen
        Dosen[] dsn = new Dosen[10];
        dsn[0] = new Dosen("Yadhi Aditya", 40, "Laki-laki", "123456789", "S.Kom, M.Kom.");
        dsn[1] = new Dosen("Ade Chandra", 44, "Laki-laki", "123456789", "S.Si, M.T.");
        dsn[2] = new Dosen("M. Fathurrahman", 43, "Laki-laki", "123456789", "S.Kom, M.Kom.");
        dsn[3] = new Dosen("Santi Sundari", 44, "Perempuan", "123456789", "S.Kom, M.Kom.");
        dsn[4] = new Dosen("Nizam", 44, "Laki-laki", "123456789", "S.Kom, M.Kom.");
        dsn[5] = new Dosen("Achmad Fauzi", 44, "Laki-laki", "123456789", "S.Kom, M.Kom.");
        dsn[6] = new Dosen("Asep", 50, "Laki-laki", "123456789", "S.Kom, M.Kom.");
        dsn[7] = new Dosen("Dinda", 24, "Perempuan", "123456789", "S.Kom, M.Kom.");
        dsn[8] = new Dosen("Dewi", 24, "Perempuan", "123456789", "S.Kom, M.Kom.");
        dsn[9] = new Dosen("Dini", 24, "Perempuan", "123456789", "S.Kom, M.Kom.");

        // Cetak data dosen
        System.out.println("Data Dosen:");
        for (int i = 0; i < dsn.length; i++) {
            System.out.println("Nama: " + dsn[i].getName() + 
                               ", Usia: " + dsn[i].getAge() + 
                               ", Jenis Kelamin: " + dsn[i].getGender() + 
                               ", NIP: " + dsn[i].getNIP() + 
                               ", Gelar: " + dsn[i].getGelar());
        }
        System.out.println();

        // Data Matakuliah
        Matakuliah[] mk = new Matakuliah[9];
        mk[0] = new Matakuliah("Dasar-Dasar Pemrograman", "IF0001", dsn[1]);
        mk[1] = new Matakuliah("Pengantar Rekayasa Perangkat Lunak", "IF0002", dsn[0]);
        mk[2] = new Matakuliah("Struktur Data", "IF0003", dsn[2]);
        mk[3] = new Matakuliah("Basis Data", "IF0004", dsn[3]);
        mk[4] = new Matakuliah("Sistem Operasi", "IF0005", dsn[4]);
        mk[5] = new Matakuliah("Pemrograman Berorientasi Objek", "IF0006", dsn[5]);
        mk[6] = new Matakuliah("Jaringan Komputer", "IF0007", dsn[6]);
        mk[7] = new Matakuliah("Pengembangan Aplikasi Web", "IF0008", dsn[7]);
        mk[8] = new Matakuliah("Keamanan Informasi", "IF0009", dsn[8]);

        // Cetak data matakuliah
        System.out.println("Data Matakuliah:");
        for (int i = 0; i < mk.length; i++) {
            System.out.println("Nama Mata Kuliah: " + mk[i].getNamaMK() + 
                               ", Kode: " + mk[i].getKodeMK() + 
                               ", Dosen Pengampu: " + mk[i].getDosenName());
        }
        System.out.println();

        // Data Jadwal
        Jadwal[] jadwal = new Jadwal[9];
        jadwal[0] = new Jadwal("Senin", "08:00 - 10:00", "Ruang 101", dsn[1], mk[0]);
        jadwal[1] = new Jadwal("Selasa", "10:00 - 12:00", "Ruang 102", dsn[0], mk[1]);
        jadwal[2] = new Jadwal("Rabu", "08:00 - 10:00", "Ruang 103", dsn[2], mk[2]);
        jadwal[3] = new Jadwal("Kamis", "13:00 - 15:00", "Ruang 104", dsn[3], mk[3]);
        jadwal[4] = new Jadwal("Jumat", "08:00 - 10:00", "Ruang 106", dsn[5], mk[5]);
        jadwal[5] = new Jadwal("Jumat", "10:00 - 12:00", "Ruang 105", dsn[4], mk[4]);
        jadwal[6] = new Jadwal("Jumat", "13:00 - 15:00", "Ruang 107", dsn[6], mk[6]);
        jadwal[7] = new Jadwal("Senin", "10:00 - 12:00", "Ruang 108", dsn[7], mk[7]);
        jadwal[8] = new Jadwal("Selasa", "13:00 - 15:00", "Ruang 109", dsn[8], mk[8]);

        // Cetak data jadwal
        System.out.println("Data Jadwal:");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Hari: " + jadwal[i].getHari() + 
                               ", Waktu: " + jadwal[i].getWaktu() + 
                               ", Ruangan: " + jadwal[i].getRuangan() + 
                               ", Dosen: " + jadwal[i].getDosenName() + 
                               ", Mata Kuliah: " + jadwal[i].getMatakuliahName());
        }
    }
}
