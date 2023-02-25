package com.cg.hbm.controller;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hbm.dto.RoomDetailsAdminResponseDTO;
import com.cg.hbm.dto.RoomDetailsDTO;
import com.cg.hbm.entity.RoomDetails;
import com.cg.hbm.exception.RoomDetailsIdNotFoundException;
import com.cg.hbm.service.IRoomDetailsService;
import com.cg.hbm.util.RoomDetailsDTOConvertor;

@RestController
@RequestMapping("/roomDetails")

public class RoomDetailsController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	IRoomDetailsService roomDetailsService;
	
	@Autowired
	RoomDetailsDTOConvertor roomDetailsDTOConvertor;
	
	public RoomDetailsController() {
		logger.info("---RoomDetails Controller Called --");
		logger.warn("---RoomDetails Controller Called --");
		
		System.err.println("RoomDetails Controller Called");
	}
	
	@PostMapping("/add")
	public ResponseEntity<RoomDetailsAdminResponseDTO> addRoomDetails(@RequestBody RoomDetails cRoomDetails) throws Exception {

		RoomDetails newRoomDetails = roomDetailsService.addRoomDetails(cRoomDetails);
		
		logger.info("---->> Review saved"+cRoomDetails);
		
		if(cRoomDetails!= null) {
			
		RoomDetailsAdminResponseDTO responseDTO = roomDetailsDTOConvertor.getRoomDetailsAdminResponseDTO(cRoomDetails);

		return new ResponseEntity<RoomDetailsAdminResponseDTO>(responseDTO, HttpStatus.OK);
	}
		return null;
	}
	
	
	@GetMapping("/allRooms")
	public ResponseEntity<List<RoomDetailsDTO>> getAllRooms() {
		List<RoomDetails> allRoomDetails = roomDetailsService.getAllRooms();
		

		   List<RoomDetailsDTO> allRoomsDTO = new ArrayList<>();
		
		    for (RoomDetails roomDetails : allRoomDetails) {
			
			   allRoomsDTO.add(roomDetailsDTOConvertor.getRoomDetailsDTO(roomDetails));
		    }

			return new ResponseEntity<List<RoomDetailsDTO>>(allRoomsDTO,HttpStatus.OK);
					   
	}
	
	
	@GetMapping("/hotelId/{hotelId}")
	public ResponseEntity<List<RoomDetailsDTO>> getRoomsByHotelId(@PathVariable int hotelId) {
		List<RoomDetails> allRoomDetails = roomDetailsService.getRoomsByHotelId(hotelId);
		

		   List<RoomDetailsDTO> allRoomsDTO = new ArrayList<>();
		
		    for (RoomDetails roomDetails : allRoomDetails) {
			
			   allRoomsDTO.add(roomDetailsDTOConvertor.getRoomDetailsDTO(roomDetails));
		    }

			return new ResponseEntity<List<RoomDetailsDTO>>(allRoomsDTO,HttpStatus.OK);
					   
	}
}
















//
//	@PutMapping("/roomDetails/update")
//	public ResponseEntity<RoomDetails> updateRoomDetails(@RequestBody RoomDetails cRoomDetails) throws RoomDetailsIdNotFoundException {
//
//		RoomDetails updatedRoomDetails =roomDetailsService.updateRoomDetails(cRoomDetails);
//		RoomDetailsAdminResponseDTO responseDTO = roomDetailsDTOConvertor.getRoomDetailsAdminResponseDTO(updatedRoomDetails);
//		
//       
//		return new ResponseEntity<RoomDetails>(updatedRoomDetails, HttpStatus.OK);
//        
//	}
//	@DeleteMapping("/roomDetails/remove/{rID}")
//	public ResponseEntity<RoomDetails> removeRoomDetails(@PathVariable Integer rID) throws RoomDetailsIdNotFoundException {
//       if(rID == null) {
//    	   throw new RoomDetailsIdNotFoundException("No customer exist with this key");
//       }
//       else {
//    	   RoomDetails removeRoomDetails = roomDetailsService.removeRoomDetails(rID);
//
//		return new ResponseEntity<RoomDetails>(removeRoomDetails, HttpStatus.OK);
//       }
//         
//	}
//
//	@GetMapping("/roomDetails/show/{rID}")
//	public ResponseEntity<RoomDetails> showRoomDetails(@PathVariable Integer rID) throws RoomDetailsIdNotFoundException {
//
//		RoomDetails showRoomDetails = roomDetailsService.removeRoomDetails(rID);
//
//		return new ResponseEntity<RoomDetails>(showRoomDetails, HttpStatus.OK);
//	}
//	
	
	

