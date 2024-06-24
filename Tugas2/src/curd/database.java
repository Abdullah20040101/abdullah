package curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {
    private String database = "2210010029";
    private String username = "root";
    private String password = "";

    public Connection konekdb;

    public database() {
        try {
            String url = "jdbc:mysql://localhost/" + this.database;
            Class.forName("com.mysql.jdbc.Driver");
            konekdb = DriverManager.getConnection(url, username, password);
            System.out.println("Database terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void simpanBerita(String idberita, String judul, String isiberita, String tanggalberita) {
        try {
            String SQL = "INSERT INTO berita (id_berita, judul, isi_berita, tgl_berita) VALUES (?, ?, ?, ?)";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idberita);
            perintah.setString(2, judul);
            perintah.setString(3, isiberita);
            perintah.setString(4, tanggalberita);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahBerita(String idberita, String judul, String isiberita, String tanggalberita) {
        try {
            String SQL = "UPDATE berita SET judul = ?, isi_berita = ?, tgl_berita = ? WHERE id_berita = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, judul);
            perintah.setString(2, isiberita);
            perintah.setString(3, tanggalberita);
            perintah.setString(4, idberita);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapusBerita(String idberita) {
        try {
            String SQL = "DELETE FROM berita WHERE id_berita = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idberita);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void simpanTamu(String idtamu, String nama, String email, String tglmasuk, String jammasuk, String komentar) {
        try {
            String SQL = "INSERT INTO buku_tamu (id_tamu, Nama, Email, tgl_masuk, jam_masuk, komentar) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idtamu);
            perintah.setString(2, nama);
            perintah.setString(3, email);
            perintah.setString(4, tglmasuk);
            perintah.setString(5, jammasuk);
            perintah.setString(6, komentar);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahTamu(String idtamu, String nama, String email, String tglmasuk, String jammasuk, String komentar) {
        try {
            String SQL = "UPDATE buku_tamu SET nama = ?, email = ?, tgl_masuk = ?, jam_masuk = ?, komentar = ? WHERE id_tamu = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, nama);
            perintah.setString(2, email);
            perintah.setString(3, tglmasuk);
            perintah.setString(4, jammasuk);
            perintah.setString(5, komentar);
            perintah.setString(6, idtamu);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapusTamu(String idtamu) {
        try {
            String SQL = "DELETE FROM buku_tamu WHERE id_tamu = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idtamu);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpansaungrelease(String idrelease, String judul, String kategori, String tanggalrelease, String isirelease) {
        try {
            String SQL = "INSERT INTO saung_release (id_release, judul, kategori, tgl_release, isi_release) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idrelease);
            perintah.setString(2, judul);
            perintah.setString(3, kategori);
            perintah.setString(4, tanggalrelease);
            perintah.setString(5, isirelease);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

 public void ubahsaungrelease(String idrelease, String judul, String kategori, String tanggalrelease, String isirelease) {
    try {
        String SQL = "UPDATE saung_release SET judul = ?, kategori = ?, tgl_release = ?, isi_release = ? WHERE id_release = ?";
        PreparedStatement perintah = konekdb.prepareStatement(SQL);
        perintah.setString(1, judul);
        perintah.setString(2, kategori);
        perintah.setString(3, tanggalrelease);
        perintah.setString(4, isirelease);
        perintah.setString(5, idrelease);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Diubah");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}


    public void hapussaungrelease(String idrelease) {
        try {
            String SQL = "DELETE FROM saung_release WHERE id_release = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idrelease);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
     public void simpansungaikecil(String kodeunsur, String shape, String namasungai) {
        try {
            String SQL = "INSERT INTO sungai_kecil (kode_unsur, shape, nama_sungai) VALUES (?, ?, ?)";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, kodeunsur);
            perintah.setString(2, shape);
            perintah.setString(3, namasungai);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

 public void ubahsungaikecil(String kodeunsur, String shape, String namasungai) {
    try {
        String SQL = "UPDATE sungai_kecil SET shape = ?, nama_sungai = ? WHERE kode_unsur = ?";
        PreparedStatement perintah = konekdb.prepareStatement(SQL);
        perintah.setString(1, shape);
        perintah.setString(2, namasungai);
        perintah.setString(3, kodeunsur);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Diubah");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}


    public void hapussungaikecil(String kodeunsur) {
        try {
            String SQL = "DELETE FROM sungai_kecil WHERE kode_unsur = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, kodeunsur);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void cariberita(String idberita) {
        try {
            String SQL = "SELECT * FROM berita WHERE id_berita = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idberita);
            ResultSet data = perintah.executeQuery();
            while (data.next()) {
                System.out.println("id_berita: " + data.getString("id_berita"));
                System.out.println("judul: " + data.getString("judul"));
                System.out.println("isi_berita: " + data.getString("isi_berita"));
                System.out.println("tgl_berita: " + data.getString("tgl_berita"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void databerita() {
        try {
            Statement stmt = konekdb.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM berita ORDER BY id_berita ASC");
            while (baris.next()) {
                System.out.println(baris.getString("id_berita") + " | " +
                                   baris.getString("judul") + " | " +
                                   baris.getString("isi_berita") + " | " +
                                   baris.getString("tgl_berita"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void datatamu() {
        try {
            Statement stmt = konekdb.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM buku_tamu ORDER BY id_tamu ASC");
            while (baris.next()) {
                System.out.println(baris.getString("id_tamu") + " | " +
                                   baris.getString("nama") + " | " +
                                   baris.getString("email") + " | " +
                                   baris.getString("tgl_masuk") + " | " +
                                   baris.getString("jam_masuk") + " | " +
                                   baris.getString("komentar"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void caritamu(String idtamu) {
        try {
            String SQL = "SELECT * FROM buku_tamu WHERE id_tamu = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idtamu);
            ResultSet data = perintah.executeQuery();
            while (data.next()) {
                System.out.println("id_tamu: " + data.getString("id_tamu"));
                System.out.println("nama: " + data.getString("nama"));
                System.out.println("email: " + data.getString("email"));
                System.out.println("tgl_masuk: " + data.getString("tgl_masuk"));
                System.out.println("jam_masuk: " + data.getString("jam_masuk"));
                System.out.println("komentar: " + data.getString("komentar"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
        public void carisaungrelease(String idrelease) {
        try {
            String SQL = "SELECT * FROM saung_release WHERE id_release = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idrelease);
            ResultSet data = perintah.executeQuery();
            while (data.next()) {
                System.out.println("id_release: " + data.getString("id_release"));
                System.out.println("judul: " + data.getString("judul"));
                System.out.println("kategori: " + data.getString("kategori"));
                System.out.println("tgl_release: " + data.getString("tgl_release"));
                System.out.println("isi_release: " + data.getString("isi_release"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void datasaungrelease() {
        try {
            Statement stmt = konekdb.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM saung_release ORDER BY id_release ASC");
            while (baris.next()) {
                System.out.println(baris.getString("id_release") + " | " +
                                   baris.getString("judul") + " | " +
                                   baris.getString("kategori") + " | " +
                                   baris.getString("tgl_release") + " | " +
                                   baris.getString("isi_release"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
        public void carisungaikecil(String kodeunsur) {
        try {
            String SQL = "SELECT * FROM sungai_kecil WHERE kode_unsur = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, kodeunsur);
            ResultSet data = perintah.executeQuery();
            while (data.next()) {
                System.out.println("kode_unsur: " + data.getString("kode_unsur"));
                System.out.println("shape: " + data.getString("shape"));
                System.out.println("nama_sungai: " + data.getString("nama_sungai"));                          }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void datasungaikecil() {
        try {
            Statement stmt = konekdb.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM sungai_kecil ORDER BY kode_unsur ASC");
            while (baris.next()) {
                System.out.println(baris.getString("kode_unsur") + " | " +
                                   baris.getString("shape") + " | " +
                                   baris.getString("nama_sungai"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    
    }
}
