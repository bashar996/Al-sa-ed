package com.example.al_saad;

 class Item {
    private String mItemName;
    private  boolean mAvailable;

     Item(String itemName , boolean available)
    {
        mItemName=itemName;
        mAvailable=available;

    }

     String getItemName() {
        return mItemName;
    }

     String getAvailability() {
        if (mAvailable)
            return  "متوفر";
        else
            return"غير متوفر حالياً";


    }

    boolean ismAvailable()
    {
        return mAvailable;
    }
}
