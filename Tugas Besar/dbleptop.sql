-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 28 Des 2020 pada 06.24
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbleptop`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `leptop`
--

CREATE TABLE `leptop` (
  `idleptop` int(11) NOT NULL,
  `idspesifikasi` int(11) NOT NULL,
  `merek` varchar(255) NOT NULL,
  `os` varchar(255) NOT NULL,
  `warna` varchar(255) NOT NULL,
  `bobot` int(11) NOT NULL,
  `ketebalan` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `leptop`
--

INSERT INTO `leptop` (`idleptop`, `idspesifikasi`, `merek`, `os`, `warna`, `bobot`, `ketebalan`, `harga`, `stok`) VALUES
(201, 1, 'Asus', 'Windows', 'hitam', 2, 3, 15000000, 3),
(202, 11, 'acer', 'windows', 'silver', 3, 3, 11500000, 2),
(203, 3, 'asus', 'windows', 'hitam mate', 2, 2, 7800000, 4),
(204, 10, 'lenovo', 'windows', 'mate black', 3, 3, 9800000, 5),
(205, 2, 'asus', 'windows', 'putih', 3, 3, 5800000, 2),
(206, 4, 'hp', 'windows', 'silver', 2, 3, 6590000, 3),
(207, 5, 'acer', 'windows', 'biru', 3, 4, 7200000, 4),
(208, 6, 'msi', 'windows', 'hitam', 3, 2, 16900000, 7),
(209, 7, 'lenovo', 'windows', 'putih', 2, 3, 7980000, 2),
(210, 8, 'hp', 'windows', 'black mate', 3, 3, 10100000, 1),
(211, 9, 'asus', 'windows', 'coral blue', 3, 3, 8950000, 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `spesifikasi`
--

CREATE TABLE `spesifikasi` (
  `idspesifikasi` int(11) NOT NULL,
  `prosesor` varchar(255) NOT NULL,
  `ram` varchar(255) NOT NULL,
  `penyimpanan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `spesifikasi`
--

INSERT INTO `spesifikasi` (`idspesifikasi`, `prosesor`, `ram`, `penyimpanan`) VALUES
(1, 'Ryzen 5 34000u', '8 gb', 'hdd 1tb'),
(2, 'intel core i3 9100u', '8gb', 'hhd 1tb'),
(3, 'intel core i3 6006u', '4gb', 'hdd 1tb'),
(4, 'intel core i5 7200u', '4gb', 'hdd 1tb'),
(5, 'ryzen 3 3500u', '8gb', 'hdd 1tb'),
(6, 'ryzen 7 4800h', '8gb', 'hdd 1tb'),
(7, 'ryzen 7 3700u', '8gb', 'hdd 1tb'),
(8, 'i7-8565u', '8gb', 'hdd 1tb'),
(9, 'ryzen 5 4300u', '8gb', 'ssd 512gb'),
(10, 'ryzen 5 4500u', '8gb', 'ssd 512gb'),
(11, 'ryzen 5 3500u', '8gb', 'ssd 512gb ');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `idtra` int(11) NOT NULL,
  `idkar` int(11) NOT NULL,
  `idus` int(11) NOT NULL,
  `idlep` int(11) NOT NULL,
  `tgltra` date NOT NULL,
  `qty` int(11) NOT NULL,
  `totalharga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`idtra`, `idkar`, `idus`, `idlep`, `tgltra`, `qty`, `totalharga`) VALUES
(1, 104, 109, 208, '2020-11-14', 2, 33800000),
(2, 104, 106, 210, '2020-11-28', 1, 10100000),
(3, 105, 110, 205, '2020-08-12', 3, 17400000),
(4, 105, 101, 209, '2020-12-06', 1, 7980000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `telepon` varchar(255) NOT NULL,
  `user` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `nama`, `alamat`, `telepon`, `user`, `pass`, `status`) VALUES
(101, 'Hendra', 'Malang', '0895498112222', 'hendra1', '121212', 'mahasiswa'),
(102, 'agil', 'sumenep', '0895391228336', 'agil2', '123123', 'mahasiswa'),
(103, 'yanto', 'surabaya', '0874653882766', 'yanto3', '112233', 'mahasiswa'),
(104, 'asep', 'sidoarjo', '086575647457', 'asep123', 'asep123', 'karyawan toko'),
(105, 'mulyadi ', 'sidoarjo', '0874675657446', 'mulyadi12', 'mulyadi123', 'karyawan toko'),
(106, 'risqon', 'malang', '087658464545', 'riskon123', 'riskon123', 'pelajar'),
(107, 'levi', 'malang', '087464756575', 'levi123', 'levi123', 'pelajar'),
(108, 'boby', 'tuban', '089757464757', 'boby123', 'boby123', 'pelajar'),
(109, 'irur', 'probolinggo', '08657567565', 'irur1234', 'irur1234', 'pegawai swasta'),
(110, 'amar', 'bandung', '08558557453', 'amar124', 'amar124', 'wirausaha'),
(111, 'kiki', 'bogor', '0896467565474', 'kiki1234', 'kiki123', 'pelajar');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `leptop`
--
ALTER TABLE `leptop`
  ADD PRIMARY KEY (`idleptop`),
  ADD KEY `idspesifikasi` (`idspesifikasi`);

--
-- Indeks untuk tabel `spesifikasi`
--
ALTER TABLE `spesifikasi`
  ADD PRIMARY KEY (`idspesifikasi`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`idtra`),
  ADD KEY `idkar` (`idkar`),
  ADD KEY `idus` (`idus`),
  ADD KEY `idlep` (`idlep`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `leptop`
--
ALTER TABLE `leptop`
  MODIFY `idleptop` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=212;

--
-- AUTO_INCREMENT untuk tabel `spesifikasi`
--
ALTER TABLE `spesifikasi`
  MODIFY `idspesifikasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `idtra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=112;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `leptop`
--
ALTER TABLE `leptop`
  ADD CONSTRAINT `leptop_ibfk_1` FOREIGN KEY (`idspesifikasi`) REFERENCES `spesifikasi` (`idspesifikasi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`idkar`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_ibfk_4` FOREIGN KEY (`idus`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_ibfk_5` FOREIGN KEY (`idlep`) REFERENCES `leptop` (`idleptop`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
