package pplnostrateam.com.insantani.Model;

/**
 * Created by Adrian on 3/7/2016.
 */
public class Vegetable {

    private String mName;
    private long mRate;
    private int mPrice;

    public Vegetable(String name, long rate, int price) {
        mName = name;
        mRate = rate;
        mPrice = price;
    }

    public Vegetable(String name) {
        this.mName = name;
        this.mRate = 0;
        this.mPrice = 10000;
    }

    public Vegetable(String s, int i) {
        this.mName = s;
        this.mRate = 0;
        this.mPrice = i;
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

    public void setPrice(int price) {
        mPrice = price;
    }


}
