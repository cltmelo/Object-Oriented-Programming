/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author Junio
 */
class ClienteDoBanco implements Comparable{

    private final String sNome;

    ClienteDoBanco(String sANome) {
        sNome = sANome;
        Object o;
    }
    String GetNome(){
        return sNome;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Comparing elements");
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ClienteDoBanco other = (ClienteDoBanco) obj;
        return (this.GetNome().compareTo(other.GetNome()) == 0);
    }

    public int hashCode() {
        int hash = 7;
        for (int i = 0; i < this.sNome.length(); i++) {
            /*(hash << 5 - hash) = hash*31, só que mais rápido*/
            hash = (hash << 5 - hash) + this.sNome.charAt(i);
        }
        System.out.println("Key: "+this.sNome + ", Hash: " + hash);
        return hash;
    }

    public int compareTo(Object o) {
        ClienteDoBanco other = (ClienteDoBanco) o;
        return this.GetNome().compareTo(other.GetNome());
    }

}
