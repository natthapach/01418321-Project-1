package controllers.services;

import models.Reservation;
import models.Van;
import services.ReservationService;

import java.util.Date;
import java.util.List;

public class ReservationSQLiteService extends SQLiteService implements ReservationService {
    public ReservationSQLiteService(String url) {
        super(url);
    }

    @Override
    public void assignVan(List<Van> vans, Reservation reservation) {

    }

    @Override
    public void assignVan(List<Van> vans, String reservationId) {

    }

    @Override
    public void editReservation(Reservation reservation) {

    }

    @Override
    public void addMeeting(String meetingPlace, Date meetingTime, Reservation reservation) {

    }

    @Override
    public void addMeeting(String meetingPlace, Date meetingTime, String reservationId) {

    }

    @Override
    public void confirmDeposit(Reservation reservation, Date depositDate) {

    }

    @Override
    public void confirmDeposit(String reservationId, Date depositDate) {

    }

    @Override
    public List<Reservation> getReservations() {
        return null;
    }

    @Override
    public Reservation getReservation(String reserveId) {
        return null;
    }
}
