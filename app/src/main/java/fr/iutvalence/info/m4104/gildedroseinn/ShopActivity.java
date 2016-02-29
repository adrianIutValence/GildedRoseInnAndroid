package fr.iutvalence.info.m4104.gildedroseinn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ShopActivity extends Activity{


	private static final Item[] ITEMS = new Item[] {
		new Item("+5 Dexterity Vest", 10, 20),
				new Item("Aged Brie", 2, 0),
				new Item("Elixir of the Mongoose", 5, 7),
				new Item("Sulfuras, Hand of Ragnaros", 0, 80),
				new Item("Sulfuras, Hand of Ragnaros", -1, 80),
				new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
				new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
				new Item("Conjured Mana Cake", 3, 6) };

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shop_layout);
		this.showItems();
	}

	protected void showItems()
	{
		ItemAdapter itemAdapter = new ItemAdapter(this, ITEMS);
		((ListView) findViewById(R.id.listView)).setAdapter(itemAdapter);

	}

	protected void buyItem(int location)
	{
		Inventory.getInstance().addItem(ITEMS[location]);
	}
}
