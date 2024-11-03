package com.furkanarslan.services.impl;

import com.furkanarslan.dto.DtoHome;
import com.furkanarslan.dto.DtoRoom;
import com.furkanarslan.entites.Home;
import com.furkanarslan.entites.Room;
import com.furkanarslan.repository.IHomeRepository;
import com.furkanarslan.services.IHomeServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HomeServices implements IHomeServices {
  @Autowired
  private IHomeRepository homeRepository;

    @Override
    public DtoHome findHomeByid(long id) {
        DtoHome dtoHome = new DtoHome();
     Optional<Home> optional = homeRepository.findById(id);
     if(optional.isEmpty()) {
         return null;
     }
     Home home = optional.get();
        List<Room> dbroom = optional.get().getRooms();

        BeanUtils.copyProperties(home, dtoHome);
if(!dbroom.isEmpty()) {
    for(Room room : dbroom) {
        DtoRoom dtoRoom = new DtoRoom();
        BeanUtils.copyProperties(room, dtoRoom);

        dtoHome.getRoom().add(dtoRoom);
    }

}

        return dtoHome;


    }
}
