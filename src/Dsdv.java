import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dsdv {

    public void timeBroadcast(Point p){
        //广播自己路由表
        //第一次只有自己信息，以后发送每次序列号加一
        List<RoutingTable> table = p.getTable();
        if (!table.equals(null) && table.size() != 0){

            List<Msg> msgList = new ArrayList<>();
            Msg msg = null;
            for (RoutingTable item : table){
                msg = new Msg();
                msg.setDest(item.getDest());
                msg.setMetric(item.getMetric());
                String[] seq = getSeqNum(item.getSeqNum());
                msg.setSeqNum(seq[0] + (Integer.getInteger(seq[1]) + 2));
                msgList.add(msg);
            }

            {
                //向邻居节点发送路由表信息
            }
        }
    }

    public void updateBroadcast(Point p){

    }

    public void updateTable(){

    }

    private String[] getSeqNum(String seqNum){
        String[] seq = new String[2];

        String regex = "(\\S_)([0-9]*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(seqNum);
        seq[0] = matcher.group(0);
        seq[1] = matcher.group(1);

        return seq;
    }
}
