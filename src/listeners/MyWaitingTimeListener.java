package listeners;

import application.JSONHandler;
import entities.AllJsonData;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import resources.DPSUtils;

public class MyWaitingTimeListener<T> implements ChangeListener<Boolean> {

	public MyWaitingTimeListener() {
	}

	@Override
	public void changed(ObservableValue<? extends Boolean> ov, Boolean oldv, Boolean newv) {
		if (!newv) {
			if(AllJsonData.getWaitingTime() > 3600) 
				AllJsonData.setWaitingTime(3600);
			if(AllJsonData.getWaitingTime() <= 10 || DPSUtils.getWaitingTime().getText().isEmpty())
				AllJsonData.setWaitingTime(10);
			DPSUtils.getWaitingTime().setText(AllJsonData.getWaitingTime() + "");
			JSONHandler.UpdatePokeList();
		}
	}

}
