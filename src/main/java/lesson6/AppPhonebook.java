package lesson6;

public class AppPhonebook {
    private View view = new View();
    private TxtWriterReader txtWriterReader = new TxtWriterReader();
    private Phonebook phonebook;


    public void start(){
        view.readCommand();
        if(view.getCommand() == 1){
            new Phonebook(txtWriterReader.readTxt()).printPhoneBook();
        }
        if (view.getCommand() == 2){
            view.readNameAndNumber();
            phonebook = new Phonebook(txtWriterReader.readTxt());
            phonebook.addContact(view.getName(), view.getNumber());
            txtWriterReader.writeTxt(phonebook.getPhonebook());
        }
        if(view.getCommand() == 3){
            view.readName();
            new Phonebook(txtWriterReader.readTxt()).getContact(view.getName());
        }
        if(view.getCommand() == 4) {
            System.exit(0);
        }
        start();

    }
//    public void fillPhonebook(){
//        phonebook.addContact("Ivan", "123456");
//        phonebook.addContact("Petr", "234567");
//        phonebook.addContact("Slava", "345678");
//        phonebook.addContact("Dima", "456789");
//        phonebook.addContact("Petr", "567891");
//        phonebook.addContact("Ivan", "123458");
//    }
}
