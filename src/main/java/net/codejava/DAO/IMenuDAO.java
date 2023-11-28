package net.codejava.DAO;

import org.springframework.data.repository.CrudRepository;

import net.codejava.entity.Menu;


public interface IMenuDAO extends CrudRepository<Menu, Long> {
}
