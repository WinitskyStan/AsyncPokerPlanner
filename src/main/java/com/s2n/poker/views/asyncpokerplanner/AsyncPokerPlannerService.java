package com.s2n.poker.views.asyncpokerplanner;

import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import org.springframework.stereotype.Service;

@Service
public class AsyncPokerPlannerService {
    private ConfirmDialog confirmDialog;

    public AsyncPokerPlannerService() {
        confirmDialog = new ConfirmDialog();
        confirmDialog.setHeader("Join Room");
        confirmDialog.setText("Coming Soon");
    }

    public void joinRoom(String roomName) {
        System.out.println("Joining room: " + roomName); ;
        confirmDialog.open();
    }
}
