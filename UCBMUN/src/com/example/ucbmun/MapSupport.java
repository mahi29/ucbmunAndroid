package com.example.ucbmun;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;


public class MapSupport extends ItemizedOverlay<OverlayItem> implements OnLongClickListener {
	
	Context mContext;
	
	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();


	public MapSupport(Drawable defaultMarker) {
		  super(boundCenterBottom(defaultMarker));
		  populate();
		}
	
	public MapSupport(Drawable defaultMarker, Context context) {
		  super(boundCenterBottom(defaultMarker));
		  mContext = context;
		  populate();
		}
	
	@Override
	protected OverlayItem createItem(int i) {
	  return mOverlays.get(i);
	}
	
	public void addOverlay(OverlayItem overlay) {
	    mOverlays.add(overlay);
	    setLastFocusedIndex(-1);
	    populate();
	}
	@Override
	public int size() {
	  return mOverlays.size();
	}
	public void removeAll() {
		mOverlays.clear();
	}
	
	public void removeIcon(GeoPoint[] gp) throws NullPointerException{
		int check = mOverlays.size();
		if (gp.length == 0) {
			return;
		}
		try {
			for (int g = 0; g < gp.length; g++) {
				GeoPoint rm = gp[g]; //This is null
				for (int m = 0; m < mOverlays.size(); m++) {
					OverlayItem temp = mOverlays.get(m);
					GeoPoint t = temp.getPoint();
					if (rm.equals(t)) {
						mOverlays.remove(m);
						setLastFocusedIndex(-1);
						populate();//What does this line do? Without it, it removes the wrong icons. With it, it works fine. 
						break;
					}
				}
			}
		} catch (NullPointerException e1) {
			e1.printStackTrace();
		}
	}
					
			
				
	@Override
	protected boolean onTap(int index) {
	  OverlayItem item = mOverlays.get(index);
	  AlertDialog.Builder dialog = new AlertDialog.Builder(mContext);
	  dialog.setTitle(item.getTitle());			//Where is the title and snippet being generated from?
	  dialog.setMessage(item.getSnippet());		//^Generated when you create the overlay item. 
	  dialog.show();
	  return true;
	}

	public boolean onLongClick(View arg0) {
		return false;
	}
	

}

