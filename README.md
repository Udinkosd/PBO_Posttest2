# PBO_Posttest2
### *Abdul Rahman A22*

# Kelas Java
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
Yaitu kelas yang mengatur _interface_ dalam program Toko Distro Online. Kelas ini menyediakan sejumlah menu pilihan yang memungkinkan pengguna untuk melakukan operasi CRUD
(Create, Read, Update, Delete) pada produk (Dalam kasus ini adalah Toko Distro Online).

### Login.java
Yaitu kelas yang berfungsi untuk memverifikasi login pengguna dalam aplikasi. Kelas ini menerima tiga argumen: username, password, dan daftar users (pengguna). Dalam metode
`verifyLogin`, kelas ini melakukan pencocokkan username dan password yang dimasukkan oleh pengguna. Jika ada pengguna yang cocok,
metode ini mengembalikan _true_, yang menunjukkan bahwa login berhasil. Jika tidak ada yang cocok, metode mengembalikan _false_, yang menunjukkan bahwa login gagal.

# Deskripsi singkat kode
## Main.java
`Main.java` adalah file utama dari aplikasi ini. Ini bertanggung jawab untuk menjalankan program. Berikut adalah cara kerja kelas ini:
- Kelas melakukan import `Menu`, `Login`, dan `User`.
- Kelas lalu menjalankan `Scanner` untuk menerima masukan dari pengguna.
- Membuat daftar `users` yang berisi pengguna dengan peran, nama pengguna, dan kata sandi tertentu.
- Meminta pengguna untuk memasukkan nama pengguna dan kata sandi.
- Memverifikasi login menggunakan metode `verifyLogin` dari kelas `Login`.
- Jika login berhasil, kode mngecek peran pengguna untuk menentukan apakah pengguna adalah admin.
- Aplikasi memanggil metode `run` dari kelas `Menu` dengan parameter _boolean_ yang menunjukkan apakah pengguna adalah admin atau bukan.
- Jika login gagal, akan muncul output "**Login gagal. Username atau password salah.**".

### Atribut
- Terdapat atribut `users` yang merupakan ArrayList yang berisi objek User. Berfungsi sebagai penyimpan data user.

### Metode
- `main(String[] args)`: Metode utama yang menjalakan program. Berfungsi untuk memverifikasi login, dan mengarahkan pengguna ke menu yang sesuai.

### Import Kelas
`Main.java` menggunakan tiga kelas utama:
1. `Menu`: Digunakan untuk menampilkan menu dan mengelola produk.
2. `Login`: Digunakan untuk memverifikasi login pengguna.
3. `User`: Digunakan untuk menyimpan informasi pengguna.

## User.java
`User.java` adalah kelas yang digunakan untuk merepresentasikan entitas pengguna. Kelas ini digunakan untuk membuat dan mengelola objek pengguna. Informasi pengguna seperti ID, nama
pengguna, kata sandi, dan peran disimpan dalam objek `User` dan digunakan dalam proses otentikasi saat login ke program. Kelas ini berada di dalam paket Database.

### Atribut
- `id`: Sebuah integer yang merupakan ID unik untuk setiap pengguna.
- `username`: Sebuah string yang menyimpan nama pengguna.
- `password`: Sebuah string yang menyimpan kata sandi pengguna.
- `role`: Sebuah string yang mengidentifikasi peran pengguna (misalnya, "admin" atau "user").

### Konstruktor
- `User(int id, String username, String password, String role)`: Konstruktor ini digunakan untuk membuat objek `User` dengan menginisialisasi atribut-atribut kelas sesuai dengan nilai
yang diberikan sebagai parameter.

### Metode
- `getId()`: Metode ini mengembalikan ID pengguna.
- `getUsername()`: Metode ini mengembalikan nama pengguna.
- `setUsername(String username)`: Metode ini mengatur nama pengguna.
- `getPassword()`: Metode ini mengembalikan kata sandi pengguna.
- `setPassword(String password)`: Metode ini mengatur kata sandi pengguna.
- `getRole()`: Metode ini mengembalikan peran pengguna.
- `setRole(String role)`: Metode ini mengatur peran pengguna.

## Product.java
`Product.java` adalah kelas yang digunakan untuk mengelola informasi produk dalam program.

###  Atribut
- `id`: Sebuah integer yang merupakan ID unik untuk setiap produk.
- `name`: Sebuah string yang menyimpan nama produk.
- `price`: Sebuah nilai desimal yang merupakan harga produk.
- `stock`: Sebuah integer yang menyimpan informasi stok produk.

### Konstruktor
- `Product(int id, String name, double price, int stock)`: Konstruktor ini digunakan untuk membuat objek `Product` dengan menginisialisasi atribut-atribut kelas sesuai dengan nilai
yang diberikan sebagai parameter.

### Metode
- `getId()`: Metode ini mengembalikan ID produk.
- `getName()`: Metode ini mengembalikan nama produk.
- `setName(String name)`: Metode ini mengatur nama produk.
- `getPrice()`: Metode ini mengembalikan harga produk.
- `setPrice(double price)`: Metode ini mengatur harga produk.
- `getStock()`: Metode ini mengembalikan jumlah stok produk.
- `setStock(int stock)`: Metode ini mengatur jumlah stok produk.

- `createProduct(String name, double price, int stock)`: Metode ini digunakan untuk membuat produk baru dengan parameter nama, harga, dan stok. Metode ini juga menghasilkan ID unik
untuk produk baru dan menambahkannya ke daftar produk.
- `readProduct(int productId)`: Metode ini digunakan untuk menampilkan informasi produk berdasarkan ID produk yang diberikan. Jika produk ditemukan, informasi produk akan ditampilkan;
jika tidak, pesan "Produk tidak ditemukan" akan muncul.
- `updateProduct(int productId, String name, double price, int stock)`: Metode ini memungkinkan pembaruan informasi produk, seperti nama, harga, dan stok, berdasarkan ID produk yang
diberikan. Jika produk ditemukan, informasi produk diperbarui; jika tidak, pesan "Produk tidak ditemukan" akan muncul.
- `deleteProduct(int productId)`: Metode ini digunakan untuk menghapus produk berdasarkan ID produk yang diberikan. Jika produk ditemukan, produk tersebut dihapus; jika tidak, pesan
"Produk tidak ditemukan" akan muncul.
- `findProductById(int productId)`: Metode ini digunakan untuk mencari produk berdasarkan ID produk. Jika produk ditemukan, objek produk akan dikembalikan; jika tidak, metode
mengembalikan `null`.
- `generateUniqueId()`: Metode ini digunakan untuk menghasilkan ID unik secara acak untuk produk baru.

## Menu.java
`Menu.java` adalah kelas untuk mengelola _interface_ program.

### Metode
- `run(boolean isAdmin)`: Metode ini adalah titik masuk utama untuk mengoperasikan antarmuka pengguna aplikasi. Metode ini menerima parameter `isAdmin` yang menentukan apakah pengguna
yang masuk adalah administrator atau tidak. Ini memulai aplikasi dan memungkinkan pengguna untuk memilih berbagai opsi melalui menu.
- Menu: Pengguna dapat memilih dari beberapa opsi menu, seperti menambah produk, menampilkan produk, memperbarui produk, menghapus produk, dan keluar dari program.
- Tambah Produk: Memungkinkan pengguna untuk memasukkan informasi produk baru, termasuk nama, harga, dan stok. Produk baru ditambahkan ke daftar produk.
- Tampilkan Produk: Menampilkan daftar produk beserta detailnya, termasuk ID, nama, harga, dan stok.
- Perbarui Produk: Memungkinkan pengguna untuk memperbarui informasi produk yang ada, seperti nama, harga, dan stok berdasarkan ID produk.
- Hapus Produk: Memungkinkan pengguna untuk menghapus produk berdasarkan ID produk.
- Loop: Metode ini berjalan akan melakukan perulangan sehingga pengguna dapat terus memilih opsi menu hingga mereka memilih untuk keluar dari aplikasi. Setiap opsi menu akan memicu
tindakan sesuai yang akan dieksekusi.
- Validasi Input: Metode ini melakukan validasi input dari pengguna untuk memastikan data yang dimasukkan sesuai dan tidak menghasilkan kesalahan dalam program..
- `Menu.java` digunakan untuk mengoperasikan antarmuka pengguna dalam program ini.

## Login.java
`Login.java` adalah kelas yang dgunakan untuk mengelola proses autentikasi pengguna dalam program.

### Metode
- `verifyLogin(String username, String password, ArrayList<User> users)`: Metode ini bertugas untuk memeriksa kredensial pengguna (username dan password) yang dimasukkan saat
login. Metode ini mengambil tiga parameter: `username` (nama pengguna yang dimasukkan), `password` (kata sandi yang dimasukkan), dan `users` (daftar pengguna yang valid). Metode ini
akan mengembalikan `true` jika kredensial yang dimasukkan sesuai dengan salah satu pengguna dalam daftar, dan `false` jika tidak sesuai dengan salah satu pengguna.
- Autentikasi: Metode ini menggunakan digunakan untuk memeriksa apakah ada pengguna dalam daftar `users` yang memiliki nama pengguna yang cocok dan kata sandi yang cocok dengan
yang dimasukkan oleh pengguna. `Login.java` adalah komponen utama dalam proses autentikasi.
