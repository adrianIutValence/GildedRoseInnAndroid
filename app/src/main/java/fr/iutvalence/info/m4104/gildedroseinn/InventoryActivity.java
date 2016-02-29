package fr.iutvalence.info.m4104.gildedroseinn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class InventoryActivity extends Activity {


   @Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inventory_layout);
		this.showItems();
	}
	protected void showItems()
	{
		ItemAdapter itemAdapter = new ItemAdapter(this, Inventory.getInstance().getItems());
		((ListView) findViewById(R.id.listView)).setAdapter(itemAdapter);

	}

	protected void useItem()
	{

	}
}

