# PBO_Posttest2
### *Abdul Rahman A22*

# Deskripsi singkat kelas
isi ini!1!!!

### Main.java
Kelas ini mengimplementasikan sistem login dengan menggunakan `ArrayList` untuk menyimpan data pengguna. 
Pengguna diminta untuk memasukkan nama pengguna (username) dan kata sandi (password). 
Setelah login berhasil, pengguna diberikan akses ke menu berdasarkan peran ("user" atau "admin"). 

### User.java
Kelas ini merupakan implementasi dari _main.java_. Didalamnya terdapat atribut seperti ID, nama pengguna (username), kata sandi (password), dan peran (role). Kelas ini
menyediakan metode `get` dan `set` untuk mengakses dan memperbarui atribut pengguna.

### Product.java
Kelas ini berisi kode product, setiap produk memiliki atribut, termasuk ID, nama, harga, dan stok. Kelas ini juga memiliki daftar produk yang dapat dikelola oleh aplikasi. 
Metode-metode di kelas ini memungkinkan pembuatan, pembacaan, pembaruan, dan penghapusan produk, serta mencari produk berdasarkan ID. Terdapat juga metode bantu untuk menghasilkan ID
unik untuk setiap produk.

### Menu.java
Yaitu kelas yang mengatur _interface_ pengguna untuk manajemen produk dalam aplikasi. Kelas ini menyediakan sejumlah menu pilihan yang memungkinkan pengguna untuk melakukan operasi CRUD
(Create, Read, Update, Delete) pada produk (Dalam kasus ini adalah Toko Distro Online).

### Login.java
Yaitu kelas yang berfungsi untuk memverifikasi login pengguna dalam aplikasi. Kelas ini menerima tiga argumen: username, password, dan daftar users (pengguna). Dalam metode
`verifyLogin`, kelas ini melakukan pencocokkan username dan password yang dimasukkan oleh pengguna. Jika ada pengguna yang cocok,
metode ini mengembalikan _true_, yang menunjukkan bahwa login berhasil. Jika tidak ada yang cocok, metode mengembalikan _false_, yang menunjukkan bahwa login gagal.

# Deskripsi singkat kode
## Main.java
`Main.java` adalah file utama dari aplikasi ini. Ini bertanggung jawab untuk menjalankan aplikasi manajemen produk. Inilah cara aplikasi bekerja:
- Import pernyataan mengimpor kelas-kelas yang diperlukan, termasuk `Menu`, `Login`, dan `User`.
- Membuat objek `Scanner` untuk menerima masukan dari pengguna.
- Membuat daftar `users` yang berisi pengguna dengan peran, nama pengguna, dan kata sandi tertentu.
- Meminta pengguna untuk memasukkan nama pengguna dan kata sandi.
- Memverifikasi login menggunakan metode `verifyLogin` dari kelas `Login`.
- Jika login berhasil, aplikasi mengecek peran pengguna untuk menentukan apakah pengguna adalah admin.
- Aplikasi memanggil metode `run` dari kelas `Menu` dengan parameter boolean yang menunjukkan apakah pengguna adalah admin atau bukan.
- Jika login gagal, aplikasi mencetak pesan kesalahan.

### Atribut
- `users`: Merupakan ArrayList yang berisi objek User. Ini digunakan untuk menyimpan informasi pengguna.

### Metode
- `main(String[] args)`: Metode utama yang menjalankan aplikasi. Ini meminta masukan pengguna, memverifikasi login, dan mengarahkan pengguna ke menu yang sesuai.

### Penggunaan Kelas
`Main.java` menggunakan tiga kelas utama:
1. `Menu`: Digunakan untuk menampilkan menu dan mengelola produk.
2. `Login`: Digunakan untuk memverifikasi login pengguna.
3. `User`: Digunakan untuk menyimpan informasi pengguna.

## User.java

`User.java` adalah kelas yang digunakan untuk merepresentasikan entitas pengguna. Berikut adalah penjelasan singkat tentang bagaimana kelas ini bekerja:

### Atribut
- `id`: Sebuah integer yang merupakan ID unik untuk setiap pengguna.
- `username`: Sebuah string yang menyimpan nama pengguna.
- `password`: Sebuah string yang menyimpan kata sandi pengguna.
- `role`: Sebuah string yang mengidentifikasi peran pengguna (misalnya, "admin" atau "user").

### Konstruktor
- `User(int id, String username, String password, String role)`: Konstruktor ini digunakan untuk membuat objek `User` dengan menginisialisasi atribut-atribut kelas sesuai dengan nilai
- yang diberikan sebagai parameter.

### Metode
- `getId()`: Metode ini mengembalikan ID pengguna.
- `getUsername()`: Metode ini mengembalikan nama pengguna.
- `setUsername(String username)`: Metode ini mengatur nama pengguna.
- `getPassword()`: Metode ini mengembalikan kata sandi pengguna.
- `setPassword(String password)`: Metode ini mengatur kata sandi pengguna.
- `getRole()`: Metode ini mengembalikan peran pengguna.
- `setRole(String role)`: Metode ini mengatur peran pengguna.

### Penggunaan Kelas
`User.java` digunakan untuk membuat dan mengelola objek pengguna. Informasi pengguna seperti ID, nama pengguna, kata sandi, dan peran disimpan dalam objek `User` dan digunakan dalam
proses otentikasi saat login ke aplikasi. Kelas ini merupakan bagian integral dari manajemen pengguna dalam aplikasi.

## Product.java
`Product.java` adalah kelas yang digunakan untuk mengelola informasi produk dalam sebuah aplikasi. Berikut adalah penjelasan singkat tentang bagaimana kelas ini bekerja:

###  Atribut
- `id`: Sebuah integer yang merupakan ID unik untuk setiap produk.
- `name`: Sebuah string yang menyimpan nama produk.
- `price`: Sebuah nilai desimal yang merupakan harga produk.
- `stock`: Sebuah integer yang menyimpan informasi stok produk.

## # Konstruktor
- `Product(int id, String name, double price, int stock)`: Konstruktor ini digunakan untuk membuat objek `Product` dengan menginisialisasi atribut-atribut kelas sesuai dengan nilai
- yang diberikan sebagai parameter.

## # Metode
- `getId()`: Metode ini mengembalikan ID produk.
- `getName()`: Metode ini mengembalikan nama produk.
- `setName(String name)`: Metode ini mengatur nama produk.
- `getPrice()`: Metode ini mengembalikan harga produk.
- `setPrice(double price)`: Metode ini mengatur harga produk.
- `getStock()`: Metode ini mengembalikan jumlah stok produk.
- `setStock(int stock)`: Metode ini mengatur jumlah stok produk.

- `createProduct(String name, double price, int stock)`: Metode ini digunakan untuk membuat produk baru dengan parameter nama, harga, dan stok. Metode ini juga menghasilkan ID unik
- untuk produk baru dan menambahkannya ke daftar produk.
- `readProduct(int productId)`: Metode ini digunakan untuk menampilkan informasi produk berdasarkan ID produk yang diberikan. Jika produk ditemukan, informasi produk akan ditampilkan;
- jika tidak, pesan "Produk tidak ditemukan" akan muncul.
- `updateProduct(int productId, String name, double price, int stock)`: Metode ini memungkinkan pembaruan informasi produk, seperti nama, harga, dan stok, berdasarkan ID produk yang
- diberikan. Jika produk ditemukan, informasi produk diperbarui; jika tidak, pesan "Produk tidak ditemukan" akan muncul.
- `deleteProduct(int productId)`: Metode ini digunakan untuk menghapus produk berdasarkan ID produk yang diberikan. Jika produk ditemukan, produk tersebut dihapus; jika tidak, pesan
- "Produk tidak ditemukan" akan muncul.
- `findProductById(int productId)`: Metode ini digunakan untuk mencari produk berdasarkan ID produk. Jika produk ditemukan, objek produk akan dikembalikan; jika tidak, metode
- mengembalikan `null`.
- `generateUniqueId()`: Metode ini digunakan untuk menghasilkan ID unik secara acak untuk produk baru.

###  Penggunaan Kelas
`Product.java` digunakan dalam manajemen produk dalam aplikasi. Ini memungkinkan penciptaan, pembacaan, pembaruan, dan penghapusan produk. Kelas ini mengelola informasi produk seperti
ID, nama produk, harga, dan stok. Produk baru dapat dibuat, dan informasi produk dapat diperbarui atau dihapus berdasarkan ID produk. Produk juga dapat dibaca berdasarkan ID produk.

## Menu.java
`Menu.java` adalah kelas yang bertanggung jawab untuk mengelola antarmuka pengguna pada aplikasi manajemen produk. Berikut adalah penjelasan singkat tentang bagaimana kelas ini bekerja:

### Metode
- `run(boolean isAdmin)`: Metode ini adalah titik masuk utama untuk mengoperasikan antarmuka pengguna aplikasi. Metode ini menerima parameter `isAdmin` yang menentukan apakah pengguna
- yang masuk adalah administrator atau tidak. Ini memulai aplikasi dan memungkinkan pengguna untuk memilih berbagai opsi melalui menu.
- Menu: Pengguna dapat memilih dari beberapa opsi menu, seperti menambah produk, menampilkan produk, memperbarui produk, menghapus produk, dan keluar dari aplikasi.
- Tambah Produk: Memungkinkan pengguna untuk memasukkan informasi produk baru, termasuk nama, harga, dan stok. Produk baru ditambahkan ke daftar produk.
- Tampilkan Produk: Menampilkan daftar produk beserta detailnya, termasuk ID, nama, harga, dan stok.
- Perbarui Produk: Memungkinkan pengguna untuk memperbarui informasi produk yang ada, seperti nama, harga, dan stok berdasarkan ID produk.
- Hapus Produk: Memungkinkan pengguna untuk menghapus produk berdasarkan ID produk.
- Keluar: Mengakhiri aplikasi.
- Penggunaan kelas: `Menu.java` berinteraksi dengan kelas `Product.java` untuk mengelola produk. Ini membuat, membaca, memperbarui, dan menghapus produk. Juga, metode ini menggunakan
- `ArrayList` untuk menyimpan daftar produk selama aplikasi berjalan.
- Loop Tak Terbatas: Metode ini berjalan dalam loop tak terbatas sehingga pengguna dapat terus memilih opsi menu hingga mereka memilih untuk keluar dari aplikasi. Setiap opsi menu akan
- memicu tindakan sesuai yang akan dieksekusi.
- Validasi Input: Metode ini melakukan validasi input dari pengguna untuk memastikan data yang dimasukkan sesuai dan tidak menghasilkan kesalahan dalam aplikasi.
- Pemilihan Produk: Beberapa opsi menu melibatkan pemilihan produk berdasarkan ID produk, dan metode ini memeriksa ketersediaan produk dengan ID yang sesuai sebelum melanjutkan operasi.
- `Menu.java` digunakan untuk mengoperasikan antarmuka pengguna dalam aplikasi manajemen produk. Ini memungkinkan pengguna untuk menambah, melihat, memperbarui, dan menghapus produk,
- serta keluar dari aplikasi.

## Login.java
`Login.java` adalah kelas yang digunakan untuk mengelola proses autentikasi pengguna dalam aplikasi manajemen produk.

### Metode
- `verifyLogin(String username, String password, ArrayList<User> users)`: Metode ini bertugas untuk memeriksa kebenaran kredensial pengguna (username dan password) yang dimasukkan saat
- login. Metode ini mengambil tiga parameter: `username` (nama pengguna yang dimasukkan), `password` (kata sandi yang dimasukkan), dan `users` (daftar pengguna yang valid). Metode ini
- akan mengembalikan `true` jika kredensial yang dimasukkan sesuai dengan salah satu pengguna dalam daftar, dan `false` jika tidak sesuai dengan salah satu pengguna.
- Autentikasi: Metode ini menggunakan ekspresi lambda untuk memeriksa apakah ada pengguna dalam daftar `users` yang memiliki nama pengguna yang cocok dan kata sandi yang cocok dengan
- yang dimasukkan oleh pengguna.
- `Login.java` adalah komponen utama dalam proses autentikasi pengguna dalam aplikasi manajemen produk. Ini memungkinkan pengguna untuk login dengan memeriksa kredensial yang
- dimasukkan terhadap daftar pengguna yang valid dan mengembalikan status autentikasi. Dalam aplikasi, ini digunakan dalam kelas `Main.java` untuk memutuskan apakah pengguna yang masuk
- adalah pengguna biasa atau administrator.

  
### Catatan
- Seiring dengan perkembangan aplikasi yang lebih besar, biasanya akan ada lapisan data yang lebih kuat dan aman untuk mengelola pengguna dan otentikasi.

### Cara Menjalankan
1. Pastikan Anda memiliki lingkungan pengembangan Java yang sudah terinstal.
2. Compile dan jalankan file `Main.java` untuk memulai program.

## Catatan
- Program ini hanya berfungsi sebagai contoh dasar dan tidak memiliki sistem penyimpanan data yang persisten. Data pengguna disimpan dalam daftar dalam kode sumber.
- Pastikan untuk memperbarui kode ini sesuai dengan kebutuhan aplikasi yang lebih kompleks.
