-- Crear tabla Clinica
CREATE TABLE Clinica (
    clinicaId BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    telefono VARCHAR(20) NOT NULL
);

-- Crear tabla Medico
CREATE TABLE Medico (
    medicoId BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    telefono VARCHAR(20),
    clinicaDondeTrabaja BIGINT,
    diaSemanaDisponible ENUM('LUNES', 'MARTES', 'MIERCOLES', 'JUEVES', 'VIERNES', 'SABADO', 'DOMINGO') NOT NULL,
    trabajaFinesSemanasYFeriados BOOLEAN NOT NULL,
    FOREIGN KEY (clinicaDondeTrabaja) REFERENCES Clinica(clinicaId)
);

-- Crear tabla Paciente
CREATE TABLE Paciente (
    pacienteId BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    edad INT,
    fechaNacimiento DATE,
    dni VARCHAR(20),
    telefono VARCHAR(20),
    fechaTurnoConMedico DATE
);

-- Insertar 10 filas en la tabla Clinica
INSERT INTO Clinica (nombre, direccion, telefono) VALUES
('Clinica Salud', 'Calle Falsa 123', '123456789'),
('Clinica Vida', 'Avenida Siempre Viva 456', '987654321'),
('Clinica Bienestar', 'Calle Luna 789', '1122334455'),
('Clinica Esperanza', 'Calle Sol 101', '9988776655'),
('Clinica Futuro', 'Avenida Estrella 202', '5566778899'),
('Clinica Horizonte', 'Calle Mar 303', '1231231234'),
('Clinica Amanecer', 'Avenida Viento 404', '9879879870'),
('Clinica Horizonte', 'Calle Cielo 505', '4564564567'),
('Clinica Brisa', 'Avenida Bruma 606', '7897897894'),
('Clinica Serenidad', 'Calle Nube 707', '3213213210');

-- Insertar 10 filas en la tabla Medico
INSERT INTO Medico (nombre, apellido, email, telefono, clinicaDondeTrabaja, diaSemanaDisponible, trabajaFinesSemanasYFeriados) VALUES
('Juan', 'Perez', 'juan.perez@gmail.com', '123456789', 1, 'LUNES', TRUE),
('Ana', 'Gomez', 'ana.gomez@gmail.com', '987654321', 2, 'MARTES', FALSE),
('Luis', 'Lopez', 'luis.lopez@gmail.com', '1122334455', 3, 'MIERCOLES', TRUE),
('Maria', 'Hernandez', 'maria.hernandez@gmail.com', '9988776655', 4, 'JUEVES', FALSE),
('Carlos', 'Rodriguez', 'carlos.rodriguez@gmail.com', '5566778899', 5, 'VIERNES', TRUE),
('Laura', 'Martinez', 'laura.martinez@gmail.com', '1231231234', 6, 'SABADO', TRUE),
('David', 'Garcia', 'david.garcia@gmail.com', '9879879870', 7, 'DOMINGO', TRUE),
('Jose', 'Fernandez', 'jose.fernandez@gmail.com', '4564564567', 8, 'LUNES', FALSE),
('Elena', 'Sanchez', 'elena.sanchez@gmail.com', '7897897894', 9, 'MARTES', TRUE),
('Miguel', 'Ramirez', 'miguel.ramirez@gmail.com', '3213213210', 10, 'MIERCOLES', FALSE);

-- Insertar 10 filas en la tabla Paciente
INSERT INTO Paciente (nombre, apellido, email, edad, fechaNacimiento, dni, telefono, fechaTurnoConMedico) VALUES
('Pedro', 'Diaz', 'pedro.diaz@gmail.com', 30, '1993-01-01', '12345678', '123456789', '2024-09-01'),
('Lucia', 'Torres', 'lucia.torres@gmail.com', 25, '1998-02-02', '87654321', '987654321', '2024-09-02'),
('Diego', 'Alvarez', 'diego.alvarez@gmail.com', 40, '1983-03-03', '12348765', '1122334455', '2024-09-03'),
('Sofia', 'Gutierrez', 'sofia.gutierrez@gmail.com', 35, '1988-04-04', '56781234', '9988776655', '2024-09-04'),
('Pablo', 'Ramos', 'pablo.ramos@gmail.com', 20, '2003-05-05', '43218765', '5566778899', '2024-09-05'),
('Isabel', 'Mendoza', 'isabel.mendoza@gmail.com', 50, '1973-06-06', '78901234', '1231231234', '2024-09-06'),
('Julian', 'Morales', 'julian.morales@gmail.com', 28, '1995-07-07', '89012345', '9879879870', '2024-09-07'),
('Valentina', 'Castro', 'valentina.castro@gmail.com', 32, '1991-08-08', '32101234', '4564564567', '2024-09-08'),
('Roberto', 'Vega', 'roberto.vega@gmail.com', 45, '1978-09-09', '21098765', '7897897894', '2024-09-09'),
('Camila', 'Cruz', 'camila.cruz@gmail.com', 27, '1996-10-10', '34567890', '3213213210', '2024-09-10');
