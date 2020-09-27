/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package percobaan3;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "SpongebobSquarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis",
        masinis);
        System.out.println(keretaApi.info());
    }
}
