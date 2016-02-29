package fr.iutvalence.info.m4104.gildedroseinn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends Activity
{
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        this.setDayText();
    }

    public void homeActivityClickListener(View view)
    {
        switch (view.getId())
        {
            case R.id.shop_button :
                startShopActivity();
                break;
            case R.id.inventory_button :
                startInventoryActivity();
                break;
            case R.id.next_button :
                nextDay();
                break;
            default :
        }
    }

    private void nextDay()
    {
        this.day += 1;
        Inventory inventory = Inventory.getInstance();
        for(int itemNumber=0; itemNumber<inventory.getItemNumber(); itemNumber+=1){
            GildedRose.updateItem(inventory.getItem(itemNumber));
        }
        this.setDayText();
    }

    private void setDayText(){
        ((TextView) findViewById(R.id.day_text)).setText("Day "+String.valueOf(this.day));
    }

    private void startInventoryActivity()
    {
        this.startActivity(new Intent(this, InventoryActivity.class));
    }

    private void startShopActivity()
    {
        this.startActivity( new Intent(this, ShopActivity.class));
    }
}

