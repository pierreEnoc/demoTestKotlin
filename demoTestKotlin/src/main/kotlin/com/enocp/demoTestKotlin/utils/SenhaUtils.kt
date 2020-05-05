package com.enocp.demoTestKotlin.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SenhaUtils {
  fun gerarBcrypt(senha: String): String = BCryptPasswordEncoder().encode(senha)
}