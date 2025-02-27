CREATE TABLE Guests (
	id INT AUTO_INCREMENT UNIQUE,
    first_name VARCHAR(200),
    last_name VARCHAR(200) NOT NULL,
    phone_number Varchar(20) NOT NULL,
    email VARCHAR(100),
    address VARCHAR(200),
    id_type VARCHAR(100), -- passport, driver's license
    id_number VARCHAR(100),
    payment_type VARCHAR(100), -- Credit Card, Cash
    
    PRIMARY KEY (id)
);

CREATE TABLE Rooms ( 
	id INT AUTO_INCREMENT UNIQUE,
    room_number INT UNIQUE,
    guest_id INT,
    room_type VARCHAR(15), -- Single, Double, Suite
    bed_type VARCHAR(15), -- King, Queen, Twin
    price_per_night DECIMAL(10, 2),
    status VARCHAR(50), -- Vacant/Occupied/Maintenance
    max_occupancy INT,
    
    PRIMARY KEY (id),
    FOREIGN KEY (guest_id) REFERENCES Guests(id) ON DELETE CASCADE
);

CREATE TABLE Occupancies (
    id INT AUTO_INCREMENT UNIQUE,
    room_id INT,
    guest_id INT,
    check_in_date DATETIME,
    check_out_date DATETIME,
    guest_count INT,
    total_bill DECIMAL(10, 2),
    payment_status VARCHAR(20), -- Paid/Pending/Overdue

  	PRIMARY KEY (id),
    FOREIGN KEY (room_id) REFERENCES Rooms(id) ON DELETE CASCADE,
    FOREIGN KEY (guest_id) REFERENCES Guests(id) ON DELETE CASCADE
);

CREATE TABLE Staff (
	id INT AUTO_INCREMENT UNIQUE,
  	first_name VARCHAR(100),
  	last_name VARCHAR(100) NOT NULL,
  	job VARCHAR(50), -- Housekeeping, Receptionist, Manager
  	phone_number VARCHAR(20) NOT NULL,
  	email VARCHAR(150),
  	shift VARCHAR(30), -- Evening, Night, Morning
  
  	PRIMARY KEY (id)
);

CREATE TABLE RoomCleaning (
  	id INT AUTO_INCREMENT UNIQUE,
  	room_id INT,
  	staff_id INT,
  	cleaning_date DATETIME,
  	cleaning_status VARCHAR(50), -- completed, in progress, not started
  	
  	PRIMARY KEY (id),
  	FOREIGN KEY (room_id) REFERENCES Rooms(id) ON DELETE CASCADE,
  	FOREIGN KEY (staff_id) REFERENCES Staff(id) ON DELETE CASCADE
);
