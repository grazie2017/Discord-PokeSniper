package listeners;

import application.JSONHandler;
import entities.AllJsonData;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import resources.DPSUtils;

public class MyTotalAmountListener<T> implements ChangeListener<Boolean> {

	public MyTotalAmountListener() {
	}

	@Override
	public void changed(ObservableValue<? extends Boolean> ov, Boolean oldv, Boolean newv) {
		if (!newv) {
			if(AllJsonData.getAmountToCatch() > 995) 
				AllJsonData.setAmountToCatch(995);
			if(AllJsonData.getAmountToCatch() <= 0 || DPSUtils.getAmountToCatch().getText().isEmpty())
				AllJsonData.setAmountToCatch(10);
			DPSUtils.getAmountToCatch().setText(AllJsonData.getAmountToCatch() + "");
			JSONHandler.UpdatePokeList();
		}
	}

}
