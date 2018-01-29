package edu.cqgcxy.service;

import edu.cqgcxy.model.ReceiveEmail;

public interface ReceiveEmailBox {

    long  countUnreadEmail(int userID);
}
