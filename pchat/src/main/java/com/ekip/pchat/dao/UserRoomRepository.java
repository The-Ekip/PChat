package com.ekip.pchat.dao;

import com.ekip.pchat.domain.userroom.UserRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoomRepository extends JpaRepository<UserRoom, Long> {
}
