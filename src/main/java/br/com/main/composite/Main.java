package br.com.main.composite;

public class Main {
	public static void main(String[] args) {
		FormValidationMessage formValidation = new FormValidationMessage("Validação de formulário.");
		
		formValidation.addMessage(new FormValidationInput("Preencha o campo endereço!"));
		formValidation.addMessage(new FormValidationFilled("Preencha o campo nome!"));
		
		formValidation.addMessage(new FormValidationFilled("Preencha o campo nome!"));
		
		FormValidationMessage formValidation2 = new FormValidationMessage("Validação de formulário.");
		
		formValidation2.addMessage(new FormValidationInput("Preencha o campo endereço!"));
		formValidation2.addMessage(new FormValidationFilled("Preencha o campo nome!"));
		
		formValidation2.addMessage(new FormValidationFilled("Preencha o campo nome!"));		
		
		formValidation.addMessage(formValidation2);
		formValidation.execute(2);
		
	}
}
