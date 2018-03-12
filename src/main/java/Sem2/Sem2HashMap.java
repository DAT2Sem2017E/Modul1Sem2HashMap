package Sem2;

import java.util.ArrayList;
import java.util.List;

/**
 The purpose of Sem2HashMap is to...

 @author kasper
 */
public class Sem2HashMap {

    private KeyValuePair[] internal;

    public Sem2HashMap() {
        internal = new KeyValuePair[ 3 ];
    }
    /**
    Hent addresse ud fra navn.
    Finder addressn på en person hvis vi kender hans navn
    @param key not null
    @return Address or null
    */
    public Address get( String key ) {
        int index = key.hashCode() % internal.length;
        return internal[ index ].value;
    }    

    public void put( String key, Address value ) {
        int index = key.hashCode() % internal.length;
        KeyValuePair kp = new KeyValuePair( key, value );
        internal[ index ] = kp;
    }

    public boolean containsKey( String key ) {
        int index = key.hashCode() % internal.length;
        return internal[ index ] != null;
    }

    public int size() {
        int s = 0;
        for ( int i = 0; i < internal.length; i++ ) {
            if ( internal[ i ] != null ) {
                s++;
            }
        }
        return s;
    }
    
    public List<Address> values() {
        ArrayList<Address> all = new ArrayList();
        for ( int i = 0; i < internal.length; i++ ) {
            if ( internal[ i ] != null ) {
                all.add( internal[ i ].value );
            }
        }
        return all;
    }
}
