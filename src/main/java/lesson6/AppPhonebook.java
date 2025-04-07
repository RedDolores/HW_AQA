package lesson6;

public class AppPhonebook {
    private View view = new View();
    private TxtWriterReader txtWriterReader = new TxtWriterReader();
    private Phonebook phonebook;


    public void start() {
        view.readCommand();
        if (view.getCommand() == 1) {
            new Phonebook(txtWriterReader.readTxt()).printPhoneBook();
        }
        if (view.getCommand() == 2) {
            view.readNameAndNumber();
            phonebook = new Phonebook(txtWriterReader.readTxt());
            phonebook.addContact(view.getName(), view.getNumber());
            txtWriterReader.writeTxt(phonebook.getPhonebook());
        }
        if (view.getCommand() == 3) {
            view.readName();
            new Phonebook(txtWriterReader.readTxt()).getContact(view.getName());
        }
        if (view.getCommand() == 4) {
            System.exit(0);
        }
        start();

    }

}
