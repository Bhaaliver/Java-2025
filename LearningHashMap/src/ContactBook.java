import java.util.HashMap;
import java.util.Set;

public class ContactBook{
    private HashMap<String, String> phoneNumberMap = new HashMap<>();
    private static int unnamedAccounts = 1;

    public void addNumber(String person, String Number){
        if(phoneNumberMap.get(person) != null){
            phoneNumberMap.remove(person);
            System.out.println("replaced: " + person);
        }
        phoneNumberMap.put(person, Number);
    }

    public void addNumber(String Number){
        phoneNumberMap.put("person"+unnamedAccounts, Number);
        unnamedAccounts++;
    }

    public String getNumber(String person){
        return phoneNumberMap.get(person);
    }

    public Set<String> getUsers(){
        return phoneNumberMap.keySet();
    }

    public void share(String Who, ContactBook With){
        if(this.phoneNumberMap.get(Who) != null)
            With.addNumber(Who, this.phoneNumberMap.get(Who));
    }
}
