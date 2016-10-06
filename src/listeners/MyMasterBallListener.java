package listeners;

import application.JSONHandler;
import entities.AllJsonData;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class MyMasterBallListener<T> implements ChangeListener<Boolean> {
	public MyMasterBallListener() {
	}

	@Override
	public void changed(ObservableValue<? extends Boolean> ov, Boolean oldv, Boolean newv) {
		AllJsonData.setPokeFarm(newv);
		JSONHandler.UpdatePokeList();
	}

}
