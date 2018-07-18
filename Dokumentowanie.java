/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dokumentowanie;

/**
 * Obiekt <code>Pracownik</code> reprezentuje Pracownika, jest to nadklasa dla...
 * opis
 * opis
 * opis
 * 
 * @author Jakub Krawczyk
 * @version 1.0.4.2 18/07/2018
 * @see dokumentowanie.Pracownik#getWynagrodzenie() 
 * @see <A href="http://forum.videokurs.pl" target="_blank"> forum video kursow</a>
 */
public class Pracownik 
{
      /**
     * Konstruktor domyslny
     */
    public Pracownik()
    {
    }
    
    /**
     * Konstruktor tworzacy obiekt <code>Pracownik</code> z imieniem i nazwiskiem
     * @param imie ustawia imie
     * @param nazwisko ustawia nazwisko
     */
    
    public Pracownik(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        
    }
    /**
     * 
     * Konstruktor tworzacy obiekt <code>Pracownik</code> z imieniem, nazwiskiem i wynagrodzeniem 
     * @param imie ustawia imie
     * @param nazwisko ustawia nazwisko
     * @param wynagrodzenie ustawia wynagrodzenie
     */
    public Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        this(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }
    /**
     * <pre>
     * Jak uzywac:
     * Pracownik p = new Pracownik();
     * p.setWynagrodzenie(1000);
     * </pre>
     * @param noweWynagrodzenie ustawiam pracownikowi nowe wynagrodzenie
     */
    public void setWynagrodzenie(double noweWynagrodzenie)
    {
        this.wynagrodzenie = noweWynagrodzenie;
    }
    /**
     * @since 1.0.0.0
     * @return zwraca pensje w typu double w zł
     */
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    
    /**
     * Imię pracownika
     */
    
    private String imie;
      /**
     * Nazwisko pracownika
     */
    private String nazwisko;
      /**
     * Wynagrodzenie pracownika w zł
     */
    private double wynagrodzenie;
}
