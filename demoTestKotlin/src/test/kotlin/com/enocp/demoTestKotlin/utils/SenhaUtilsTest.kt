package com.enocp.demoTestKotlin.utils

import org.junit.Assert
import org.junit.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

//test unitario nao carregar spring
class SenhaUtilsTest {
  
  private val SENHA = "123456"
  private val bCryptEncoder = BCryptPasswordEncoder()
  
  @Test
  fun testGerarHashSenha() {
    val hash = SenhaUtils().gerarBcrypt(SENHA)
    Assert.assertTrue(bCryptEncoder.matches(SENHA, hash))
  }
}