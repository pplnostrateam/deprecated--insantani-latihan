package pplnostrateam.com.insantani.Model;

/**
 * Created by Adrian on 3/7/2016.
 */
public class Vegetable {

    private String mName;
    private long mRate;
    private long mPrice;

    public Vegetable(String name, long rate, long price) {
        mName = name;
        mRate = rate;
        mPrice = price;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public long getRate() {
        return mRate;
    }

    public void setRate(long rate) {
        mRate = rate;
    }

    public long getPrice() {
        return mPrice;
    }

    public void setPrice(long price) {
        mPrice = price;
    }


}
