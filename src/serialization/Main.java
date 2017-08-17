package serialization;

import java.io.*;

/**
 * Created by Lenovo on 17.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("plik.oskar");
        Person person = new Person("Oskar", "Polak", 5, 'M');

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // to sluzy do zapisywania obiektu do pliku wskazanego
        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //to sluzy do odczytywania zapisanego obiektu
        try {
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream(file));
            Person personRead = (Person) objectInputStream.readObject();
            System.out.println("Odczytano (" + personRead.getName() + ")");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
