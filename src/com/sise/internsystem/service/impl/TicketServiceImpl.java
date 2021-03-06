package com.sise.internsystem.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sise.internsystem.base.DaoSupportImpl;
import com.sise.internsystem.entity.Ticket;
import com.sise.internsystem.service.TicketService;

@Service
@Transactional 
public class TicketServiceImpl extends DaoSupportImpl<Ticket> implements TicketService {
	
}
