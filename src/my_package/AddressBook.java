package my_package;
import java.util.ArrayList;
import java.util.List;


public class AddressBook {
    private List<BodyInfo> Buddies;

     AddressBook(){
        Buddies = new ArrayList<>();
    }

    public void addBuddy(BodyInfo new_buddy){
         Buddies.add(new_buddy);
         System.out.println(new_buddy.getName());
    }

    public void removeBuddy(BodyInfo old_buddy){
         for(int i=0;i<Buddies.size();i++){
             if (old_buddy.getName().equals(Buddies.get(i).getName())){
                 Buddies.remove(i);
                 return;
             }
         }
    }

    public static void main(String[] args){
         BodyInfo Tom = new BodyInfo("Tom");
        BodyInfo Amir = new BodyInfo("Amir");
         AddressBook My_friend = new AddressBook();
         My_friend.addBuddy(Tom);
         My_friend.removeBuddy((Tom));
         My_friend.addBuddy(Amir);
    }

}
