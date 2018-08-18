import java.util.List;

public class Bsearch {

	public Item BSearch(List<Item> items, int time) {
		if (time < items.get(0).getTime()) {
			return null;
		}
		int size = items.size();
		int l = 0;
		int r = size - 1;
		int p = BSearchUti(items, l, r, time);
		return items.get(p);
	}

	private int BSearchUti(List<Item> items, int l, int r, int time) {
		if (l > r)
			return -1;

		if (time >= items.get(r).getTime())
			return r;

		int mid = (l + r) / 2;

		if (items.get(mid).getTime() == time)
			return mid;

		if (mid > 0 && items.get(mid - 1).getTime() <= time && time < items.get(mid).getTime())
			return mid - 1;

		if (time < items.get(mid).getTime())
			return BSearchUti(items, l, mid - 1, time);

		return BSearchUti(items, mid + 1, r, time);
	}
}
