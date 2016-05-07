-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 05-Maio-2016 às 18:19
-- Versão do servidor: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dai (1)`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `category_process`
--

CREATE TABLE IF NOT EXISTS `category_process` (
  `lawsuit_category` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `nif_cli` int(9) NOT NULL,
  `name_cli` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `contact_cli` int(9) NOT NULL,
  `nif_mand` int(9) NOT NULL,
  `name_mand` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `address_cli` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `contact_mand` int(9) NOT NULL,
  `email_cli` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Extraindo dados da tabela `client`
--

INSERT INTO `client` (`nif_cli`, `name_cli`, `contact_cli`, `nif_mand`, `name_mand`, `address_cli`, `contact_mand`, `email_cli`) VALUES
(123456789, '', 0, 0, '', '', 0, '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `complaint`
--

CREATE TABLE IF NOT EXISTS `complaint` (
  `complaint_state` char(1) COLLATE utf8_general_mysql500_ci NOT NULL,
  `description_com` varchar(1000) COLLATE utf8_general_mysql500_ci NOT NULL,
  `num_law` int(11) NOT NULL,
  `date` date NOT NULL,
  `value_recognize` float NOT NULL,
  `value_proposal` float NOT NULL,
  `number_complaint` int(11) NOT NULL,
  `name_complaint` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `debt`
--

CREATE TABLE IF NOT EXISTS `debt` (
  `value_debts` float NOT NULL,
  `num_law` int(11) NOT NULL,
  `nif_int` int(9) NOT NULL,
  `pay_refer` int(11) NOT NULL,
  `description_debt` varchar(1000) COLLATE utf8_general_mysql500_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `document`
--

CREATE TABLE IF NOT EXISTS `document` (
  `document` text COLLATE utf8_general_mysql500_ci NOT NULL,
  `ref_pay` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `employe`
--

CREATE TABLE IF NOT EXISTS `employe` (
  `num_emp` int(11) NOT NULL,
  `name_emp` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `contact_emp` int(9) NOT NULL,
  `address_emp` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `description_emp` varchar(1000) COLLATE utf8_general_mysql500_ci NOT NULL,
  `nif_emp` int(9) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Extraindo dados da tabela `employe`
--

INSERT INTO `employe` (`num_emp`, `name_emp`, `contact_emp`, `address_emp`, `description_emp`, `nif_emp`) VALUES
(1, '', 0, '', '', 987654321);

-- --------------------------------------------------------

--
-- Estrutura da tabela `financial_asset`
--

CREATE TABLE IF NOT EXISTS `financial_asset` (
  `name_pro` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `id_pro` int(11) NOT NULL,
  `price_sale` float NOT NULL,
  `purchase_state` char(1) COLLATE utf8_general_mysql500_ci NOT NULL,
  `description` varchar(1000) COLLATE utf8_general_mysql500_ci NOT NULL,
  `category` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `district` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `num_law` int(11) NOT NULL,
  `address` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `postal_code` varchar(8) COLLATE utf8_general_mysql500_ci NOT NULL,
  `image` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `locality` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `price_evaluation` float NOT NULL,
  `sub_category` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Extraindo dados da tabela `financial_asset`
--

INSERT INTO `financial_asset` (`name_pro`, `id_pro`, `price_sale`, `purchase_state`, `description`, `category`, `district`, `num_law`, `address`, `postal_code`, `image`, `locality`, `price_evaluation`, `sub_category`) VALUES
('', 1, 10.5, '1', '', 'bens moveis', 'braga', 1, '', '0', 'carro.jpg', '', 0, '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `historic`
--

CREATE TABLE IF NOT EXISTS `historic` (
  `date` date NOT NULL,
  `num_emp` int(11) NOT NULL,
  `num_law` int(11) NOT NULL,
  `alt_description` varchar(1000) COLLATE utf8_general_mysql500_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `intervenients_entities`
--

CREATE TABLE IF NOT EXISTS `intervenients_entities` (
  `name_int` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `address_int` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `nif_int` int(9) NOT NULL,
  `nib_pay` int(21) NOT NULL,
  `contact_int` int(9) NOT NULL,
  `type` char(1) COLLATE utf8_general_mysql500_ci NOT NULL,
  `name_mand` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `address_mand` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `judge`
--

CREATE TABLE IF NOT EXISTS `judge` (
  `name_judge` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `lawsuit`
--

CREATE TABLE IF NOT EXISTS `lawsuit` (
  `num_law` int(11) NOT NULL,
  `date_beg` date NOT NULL,
  `date_end` date NOT NULL,
  `date_ass` date NOT NULL,
  `name_judge` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `nif_cli` int(9) NOT NULL,
  `state_pro` char(1) COLLATE utf8_general_mysql500_ci NOT NULL,
  `num_adm` int(11) NOT NULL,
  `date_bankruptcy` date NOT NULL,
  `name_trib` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL,
  `category_law` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Extraindo dados da tabela `lawsuit`
--

INSERT INTO `lawsuit` (`num_law`, `date_beg`, `date_end`, `date_ass`, `name_judge`, `nif_cli`, `state_pro`, `num_adm`, `date_bankruptcy`, `name_trib`, `category_law`) VALUES
(1, '0000-00-00', '0000-00-00', '0000-00-00', '', 123456789, '', 1, '0000-00-00', '', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `online_information`
--

CREATE TABLE IF NOT EXISTS `online_information` (
  `cv_edit` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `email_company` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `phone_company` int(9) NOT NULL,
  `address_company` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `description_comp` varchar(1000) COLLATE utf8_general_mysql500_ci NOT NULL,
  `postal_code_company` varchar(8) COLLATE utf8_general_mysql500_ci NOT NULL,
  `fax_company` int(9) NOT NULL,
  `telephone_company` int(9) NOT NULL,
  `conditions` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `link` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `name_link` varchar(50) COLLATE utf8_general_mysql500_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Extraindo dados da tabela `online_information`
--

INSERT INTO `online_information` (`cv_edit`, `email_company`, `phone_company`, `address_company`, `description_comp`, `postal_code_company`, `fax_company`, `telephone_company`, `conditions`, `link`, `name_link`) VALUES
('', 'lex@guima.com', 253123456, 'rua lex guima', '', '4710', 253123457, 961234567, '', '', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `payment`
--

CREATE TABLE IF NOT EXISTS `payment` (
  `total_pay` double(10,2) NOT NULL,
  `date` date NOT NULL,
  `pay_refer` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `proposal`
--

CREATE TABLE IF NOT EXISTS `proposal` (
  `name` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `price_proposal` float NOT NULL,
  `id_pro` int(11) NOT NULL,
  `type_proposal` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `BI/CC` int(8) NOT NULL,
  `proposal_address` varchar(100) COLLATE utf8_general_mysql500_ci NOT NULL,
  `postal_code` varchar(8) COLLATE utf8_general_mysql500_ci NOT NULL,
  `telephone_pro` int(9) NOT NULL,
  `nipc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `right`
--

CREATE TABLE IF NOT EXISTS `right` (
  `date` date NOT NULL,
  `total_pay` float NOT NULL,
  `nif_int` int(9) NOT NULL,
  `pay_refer` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `type` char(1) COLLATE utf8_general_mysql500_ci NOT NULL,
  `username` varchar(12) COLLATE utf8_general_mysql500_ci NOT NULL,
  `password` varchar(20) COLLATE utf8_general_mysql500_ci NOT NULL,
  `num_emp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category_process`
--
ALTER TABLE `category_process`
  ADD PRIMARY KEY (`lawsuit_category`),
  ADD KEY `lawsuit_category` (`lawsuit_category`),
  ADD KEY `lawsuit_category_2` (`lawsuit_category`);

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`nif_cli`);

--
-- Indexes for table `complaint`
--
ALTER TABLE `complaint`
  ADD PRIMARY KEY (`number_complaint`),
  ADD KEY `num_law` (`num_law`);

--
-- Indexes for table `debt`
--
ALTER TABLE `debt`
  ADD PRIMARY KEY (`pay_refer`),
  ADD KEY `name_process` (`num_law`),
  ADD KEY `nif_int` (`nif_int`),
  ADD KEY `pay_refer` (`pay_refer`),
  ADD KEY `value_debts` (`value_debts`);

--
-- Indexes for table `document`
--
ALTER TABLE `document`
  ADD PRIMARY KEY (`ref_pay`);

--
-- Indexes for table `employe`
--
ALTER TABLE `employe`
  ADD PRIMARY KEY (`num_emp`),
  ADD UNIQUE KEY `nif_company_2` (`nif_emp`),
  ADD KEY `nif_company` (`nif_emp`);

--
-- Indexes for table `financial_asset`
--
ALTER TABLE `financial_asset`
  ADD PRIMARY KEY (`id_pro`,`num_law`),
  ADD KEY `num_pro` (`num_law`);

--
-- Indexes for table `historic`
--
ALTER TABLE `historic`
  ADD PRIMARY KEY (`date`,`num_law`),
  ADD KEY `num_law` (`num_law`),
  ADD KEY `num_emp` (`num_emp`);

--
-- Indexes for table `intervenients_entities`
--
ALTER TABLE `intervenients_entities`
  ADD PRIMARY KEY (`nif_int`),
  ADD KEY `nib_pay` (`nib_pay`),
  ADD KEY `nib_pay_2` (`nib_pay`);

--
-- Indexes for table `judge`
--
ALTER TABLE `judge`
  ADD PRIMARY KEY (`name_judge`),
  ADD UNIQUE KEY `name_judge` (`name_judge`),
  ADD KEY `name_judge_2` (`name_judge`);

--
-- Indexes for table `lawsuit`
--
ALTER TABLE `lawsuit`
  ADD PRIMARY KEY (`num_law`),
  ADD UNIQUE KEY `name_judge` (`name_judge`),
  ADD KEY `nif_cli` (`nif_cli`),
  ADD KEY `num_adm` (`num_adm`),
  ADD KEY `name_trib` (`name_trib`),
  ADD KEY `category_law` (`category_law`);

--
-- Indexes for table `online_information`
--
ALTER TABLE `online_information`
  ADD KEY `email_company` (`email_company`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`pay_refer`);

--
-- Indexes for table `proposal`
--
ALTER TABLE `proposal`
  ADD PRIMARY KEY (`id_pro`,`BI/CC`),
  ADD KEY `id_pro` (`id_pro`);

--
-- Indexes for table `right`
--
ALTER TABLE `right`
  ADD PRIMARY KEY (`pay_refer`),
  ADD KEY `nif_int` (`nif_int`),
  ADD KEY `pay_refer` (`pay_refer`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`,`password`),
  ADD KEY `num_emp` (`num_emp`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employe`
--
ALTER TABLE `employe`
  MODIFY `num_emp` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `lawsuit`
--
ALTER TABLE `lawsuit`
  MODIFY `num_law` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `complaint`
--
ALTER TABLE `complaint`
  ADD CONSTRAINT `complaint_ibfk_1` FOREIGN KEY (`num_law`) REFERENCES `lawsuit` (`num_law`);

--
-- Limitadores para a tabela `debt`
--
ALTER TABLE `debt`
  ADD CONSTRAINT `debt_ibfk_1` FOREIGN KEY (`num_law`) REFERENCES `lawsuit` (`num_law`),
  ADD CONSTRAINT `debt_ibfk_2` FOREIGN KEY (`nif_int`) REFERENCES `intervenients_entities` (`nif_int`),
  ADD CONSTRAINT `debt_ibfk_3` FOREIGN KEY (`pay_refer`) REFERENCES `payment` (`pay_refer`);

--
-- Limitadores para a tabela `document`
--
ALTER TABLE `document`
  ADD CONSTRAINT `document_ibfk_1` FOREIGN KEY (`ref_pay`) REFERENCES `payment` (`pay_refer`);

--
-- Limitadores para a tabela `financial_asset`
--
ALTER TABLE `financial_asset`
  ADD CONSTRAINT `financial_asset_ibfk_1` FOREIGN KEY (`num_law`) REFERENCES `lawsuit` (`num_law`);

--
-- Limitadores para a tabela `historic`
--
ALTER TABLE `historic`
  ADD CONSTRAINT `historic_ibfk_1` FOREIGN KEY (`num_emp`) REFERENCES `employe` (`num_emp`),
  ADD CONSTRAINT `historic_ibfk_2` FOREIGN KEY (`num_law`) REFERENCES `lawsuit` (`num_law`);

--
-- Limitadores para a tabela `lawsuit`
--
ALTER TABLE `lawsuit`
  ADD CONSTRAINT `lawsuit_ibfk_1` FOREIGN KEY (`num_adm`) REFERENCES `employe` (`num_emp`),
  ADD CONSTRAINT `lawsuit_ibfk_2` FOREIGN KEY (`nif_cli`) REFERENCES `client` (`nif_cli`);

--
-- Limitadores para a tabela `proposal`
--
ALTER TABLE `proposal`
  ADD CONSTRAINT `proposal_ibfk_1` FOREIGN KEY (`id_pro`) REFERENCES `financial_asset` (`id_pro`);

--
-- Limitadores para a tabela `right`
--
ALTER TABLE `right`
  ADD CONSTRAINT `right_ibfk_1` FOREIGN KEY (`nif_int`) REFERENCES `lawsuit` (`num_law`),
  ADD CONSTRAINT `right_ibfk_2` FOREIGN KEY (`pay_refer`) REFERENCES `payment` (`pay_refer`);

--
-- Limitadores para a tabela `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`num_emp`) REFERENCES `employe` (`num_emp`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
