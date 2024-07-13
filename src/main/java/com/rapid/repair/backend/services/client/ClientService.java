package com.rapid.repair.backend.services.client;

import com.rapid.repair.backend.dto.AdDTO;
import com.rapid.repair.backend.dto.AdDetailsForClientDTO;
import com.rapid.repair.backend.dto.ReservationDTO;
import com.rapid.repair.backend.dto.ReviewDTO;

import java.util.List;

public interface ClientService {

    List<AdDTO> getAllAds();

    List<AdDTO> searchAdByName(String name);

    boolean bookService(ReservationDTO reservationDTO);

    AdDetailsForClientDTO getAdDetailsByAdId(Long adId);

    List<ReservationDTO> getAllBookingsByUserId(Long userId);

    Boolean giveReview(ReviewDTO reviewDTO);
}
