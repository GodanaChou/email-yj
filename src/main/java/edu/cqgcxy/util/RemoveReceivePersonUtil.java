package edu.cqgcxy.util;

import edu.cqgcxy.model.RemoveReceivePerson;

import java.util.ArrayList;
import java.util.List;

public class RemoveReceivePersonUtil {
    public List<RemoveReceivePerson> remove(String receivePerson){
        List<RemoveReceivePerson> person = new ArrayList<>();
        RemoveReceivePerson removeReceivePerson =doRemoves(receivePerson);
        person.add(removeReceivePerson);
        //暂时只支持193后缀,可扩展@qq.com发送等
        out:if("193".equals(removeReceivePerson.getType())&&receivePerson.length()>14){
            receivePerson = remove193(receivePerson);
            RemoveReceivePerson removeReceivePerson1 = doRemoves(receivePerson);
            person.add(removeReceivePerson1);
            if(receivePerson.length()>14) {
                break out;
            }
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

}
