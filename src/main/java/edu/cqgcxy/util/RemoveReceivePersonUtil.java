package edu.cqgcxy.util;

import edu.cqgcxy.model.RemoveReceivePerson;
import edu.cqgcxy.model.SendEmail;

import java.util.ArrayList;
import java.util.List;

public class RemoveReceivePersonUtil {
    public List<RemoveReceivePerson> remove(String receivePerson){
        List<RemoveReceivePerson> person = new ArrayList<>();
        RemoveReceivePerson removeReceivePerson =doRemoves(receivePerson);
        person.add(removeReceivePerson);
        receivePerson = remove193(receivePerson);
        //暂时只支持193后缀,可扩展@qq.com发送等
        for(int x =receivePerson.length();"193".equals(removeReceivePerson.getType()) && x > 19;x = receivePerson.length()){
            RemoveReceivePerson removeReceivePerson1 = doRemoves(receivePerson);
            person.add(removeReceivePerson1);
            receivePerson = remove193(receivePerson);
        }
        return person;
    }

    public RemoveReceivePerson doRemoves(String receivePerson){
        RemoveReceivePerson removeReceivePerson = new RemoveReceivePerson();
        removeReceivePerson.setPerson(receivePerson.
                substring(0,receivePerson.indexOf("@")));
        String type = receivePerson.substring
                (receivePerson.indexOf("@")+1,receivePerson.indexOf("."));
        removeReceivePerson.setType(type);
    return removeReceivePerson;
    }

    public String remove193(String receivePerson){
       String str = receivePerson.substring(receivePerson.indexOf(";")+1,receivePerson.length());
       return str;
    }

    public String removeUserName(String phone){
        StringBuilder receivePerson = new StringBuilder() ;
        do {
            String c = phone.substring(phone.indexOf("<") + 1, phone.indexOf(">"));
            receivePerson.append(c)  ;
            receivePerson.append(";");

            if(phone.indexOf(">")+2==phone.length()){
                phone = null;
            }
            else {
            phone = phone.substring(phone.indexOf(">")+1,phone.length());
            }
        }while ( phone != null && phone.length()>10);
        return receivePerson.toString();
    }

}
