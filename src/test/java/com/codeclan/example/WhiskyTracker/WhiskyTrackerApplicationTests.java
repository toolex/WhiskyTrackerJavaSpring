package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindAllWhiskysByYear(){
		List<Whisky> foundWhiskies = whiskyRepository.findAllWhiskysByYear(1991);
		assertEquals(1, foundWhiskies.size());
		assertEquals("The Rosebank 12 - Flora and Fona", foundWhiskies.get(0).getName());
	}

	@Test
	public void canFindAllDistilleriesByRegion(){
		List<Distillery> foundDistilleries = distilleryRepository.findAllDistilleriesByRegion("Highland");
		assertEquals(1, foundDistilleries.size());
		assertEquals("Glendronach", foundDistilleries.get(0).getName());
	}

	@Test
	public void canFindAllWhiskysByDistilleryNameAndAge(){
		List<Whisky> foundWhiskies = whiskyRepository.findAllWhiskysByDistilleryNameAndAge("Glendronach", 15);
		assertEquals(1, foundWhiskies.size());
		assertEquals("The Glendronach Revival", foundWhiskies.get(0).getName());
	}

	@Test
	public void canFindAllWhiskysByRegion(){
		List<Whisky> foundWhiskies = whiskyRepository.findAllWhiskysByDistilleryRegion("Lowland");
		assertEquals(1, foundWhiskies.size());
		assertEquals("The Rosebank 12 - Flora and Fona", foundWhiskies.get(0).getName());
	}

	@Test
	public void canFindAllDistilleriesByWhiskiesAge(){
		List<Distillery> foundDistilleries = distilleryRepository.findAllDistilleriesByWhiskiesAge(12);
		assertEquals(2, foundDistilleries.size());
	}

}
