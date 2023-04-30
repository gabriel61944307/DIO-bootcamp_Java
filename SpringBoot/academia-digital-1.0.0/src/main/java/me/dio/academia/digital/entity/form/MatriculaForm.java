package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {
	
	@NotNull(message = "Esse campo deve ser preenchido.")
	@Positive(message = "O id do aluno precisa ser positivo.")
	private Long alunoId;

public Long getAlunoId() {
	return alunoId;
}

public void setAlunoId(Long alunoId) {
	this.alunoId = alunoId;
}
  
  

}
