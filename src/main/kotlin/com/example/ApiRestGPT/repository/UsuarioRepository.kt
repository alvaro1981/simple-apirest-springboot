package com.example.ApiRestGPT.repository


import com.example.ApiRestGPT.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario, Long>