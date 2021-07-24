package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;



@RunWith(SpringJUnit4ClassRunner.class) // ���� �׽�Ʈ �ڵ尡 �������� �����ϴ� ������ �� ��
@ContextConfiguration(classes = {RootConfig.class}) // ������ Ŭ������ ���ڿ��� �̿��ؼ� �ʿ��� ��ü���� ������ �� ��ü�� ���
@Log4j // �α�
public class SampleTests {
	
	@Setter(onMethod_ = { @Autowired }) // Autowired --> �ش� �ν��Ͻ� ������ ���������κ��� �ڵ����� ������ �޶�� ǥ��
	private Restaurant restaurant;
	
	@Test // �׽�Ʈ ����� ǥ��
	public void testExist() {
		
		assertNotNull(restaurant); // �׽�Ʈ ����� null�� �ƴϿ��� �׽�Ʈ�� ����
		
		log.info(restaurant);
		log.info("----------------------------------------");
		log.info(restaurant.getChef());
	}
}
