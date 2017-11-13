package bootsample.controller;

import java.sql.Timestamp;
import java.util.Date;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootsample.model.Task;
import bootsample.service.TaskService;

@RestController
public class SampleRestController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World";
	}
	/*
	@GetMapping("/all-tasks")
	public String allTasks()
	{
		return taskService.findAll().toString();
	}
	
	@GetMapping("/save-task")
	public String saveTask(@RequestParam String name, @RequestParam String desc)
	{
//		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//		return "name= "+name+", desc= "+desc+", date= "+new Date()+", timestamp= "+timestamp;
		Task task = new Task(name, desc, timestamp, true,-1);
		taskService.save(task);
		return "Task saved";
	}
	
	@GetMapping("/delete-task")
	public String deleteTask(@RequestParam int id)
	{
		taskService.delete(id);
		return "Task deleted";
	}
	
	@GetMapping("/find-task")
	public Task findTask(@RequestParam int id, @RequestParam String name, @RequestParam String desc)
	{
//		taskService.findTask(id);
//		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//		return "name= "+name+", desc= "+desc+", date= "+new Date()+", timestamp= "+timestamp;
//		Task task = new Task(name, desc, timestamp, true);
//		String hasil = taskService.findTask(id);
//		return "Task updated";
//		String sql = "UPDATE `taskdb`.`t_tasks` SET `name` = '"+name+"', `description` = '"+desc+"', `data_created` = "+timestamp+", `finished` = "+1+" WHERE `id` = "+id+"";
//		JdbcTemplate.update(sql);
		return taskService.findTask(id);
	}
	@GetMapping("/update-task")
	public String updateTask(@RequestParam int id, @RequestParam String name, @RequestParam String desc)
	{
//		taskService.findTask(id);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//		return "name= "+name+", desc= "+desc+", date= "+new Date()+", timestamp= "+timestamp;
//		Task task =  taskService.findTask(id);
		Task task = new Task(name,desc, timestamp, true,id);
//		Task2 task = new Task2(id, name, desc, timestamp, true);
		taskService.save(task);
		return "Task updated";
	}
	*/
}
