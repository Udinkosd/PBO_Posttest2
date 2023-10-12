# PBO_Posttest2
### *Abdul Rahman A22*

# Deskripsi Kode
Ini adalah contoh kode Java untuk sistem login sederhana dengan dua peran pengguna, yaitu 'user' dan 'admin'. Kode ini memiliki tiga kelas utama: `Menu`, `Login`, dan `User`.
### Main.java
Kelas ini mengimplementasikan sistem login dengan menggunakan ArrayList untuk menyimpan data pengguna. 
Pengguna diminta untuk memasukkan nama pengguna (username) dan kata sandi (password). 
Setelah login berhasil, pengguna diberikan akses ke menu berdasarkan peran ("user" atau "admin"). 
### User.java

## Bagian-Bagian Kode

### Main.java
- `Main` adalah kelas utama yang berfungsi sebagai entry point untuk program ini. Di sini, pengguna diminta untuk memasukkan username dan password.
- Selanjutnya, program akan memeriksa apakah pengguna yang masuk memiliki peran sebagai 'admin' atau 'user'.
- Jika login berhasil, program akan memanggil kelas `Menu` untuk menjalankan menu aplikasi sesuai peran pengguna.
- Jika login gagal, maka code akan melakukan `Print.out` error.
- 
Kelas `User` adalah kelas yang merepresentasikan entitas pengguna dalam sistem. Setiap objek `User` memiliki beberapa atribut, seperti ID, username, password, dan role (peran).

## Atribut Kelas User

- `id`: Sebuah integer yang unik yang mewakili ID pengguna.
- `username`: String yang menyimpan nama pengguna.
- `password`: String yang digunakan untuk menyimpan kata sandi pengguna.
- `role`: String yang menyatakan peran pengguna, seperti 'admin' atau 'user'.

## Konstruktor
- `User(int id, String username, String password, String role)`: Konstruktor untuk membuat objek `User` dengan menginisialisasi atribut-atribut pengguna saat objek dibuat.

## Metode

- `getId()`: Metode ini mengembalikan ID pengguna.
- `getUsername()`: Metode ini mengembalikan nama pengguna.
- `setUsername(String username)`: Metode ini digunakan untuk mengatur nama pengguna.
- `getPassword()`: Metode ini mengembalikan kata sandi pengguna.
- `setPassword(String password)`: Metode ini digunakan untuk mengatur kata sandi pengguna.
- `getRole()`: Metode ini mengembalikan peran pengguna.
- `setRole(String role)`: Metode ini digunakan untuk mengatur peran pengguna.

## Penggunaan Kelas User
Kelas `User` digunakan dalam sistem login sederhana untuk menyimpan data pengguna. Penggunaan kelas ini sangat dasar dan dapat diperluas sesuai dengan kebutuhan sistem yang lebih kompleks.

Pastikan untuk memahami bahwa kode ini hanya berfungsi sebagai contoh dasar dan tidak memiliki sistem penyimpanan data yang persisten. Data pengguna disimpan dalam objek `User` yang disimpan dalam kode sumber.

## Catatan
- Seiring dengan perkembangan aplikasi yang lebih besar, biasanya akan ada lapisan data yang lebih kuat dan aman untuk mengelola pengguna dan otentikasi.

## Cara Menjalankan
1. Pastikan Anda memiliki lingkungan pengembangan Java yang sudah terinstal.
2. Compile dan jalankan file `Main.java` untuk memulai program.

## Catatan
- Program ini hanya berfungsi sebagai contoh dasar dan tidak memiliki sistem penyimpanan data yang persisten. Data pengguna disimpan dalam daftar dalam kode sumber.
- Pastikan untuk memperbarui kode ini sesuai dengan kebutuhan aplikasi yang lebih kompleks.
