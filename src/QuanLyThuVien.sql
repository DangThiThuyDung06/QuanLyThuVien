create database QuanLySach
go
use QuanLySach 
go
create table QuanLyThuVien(
MaTaiLieu varchar(7) PRIMARY KEY,
LoaiTaiLieu nvarchar(30),
TenNXB nvarchar(30),
SoBanPhatHanh int,
TenTacGia nvarchar(45),
SoTrang int,
SoPhatHanh int,
ThangPhatHanh int,
NgayPhatHanh int
)
INSERT INTO QuanLyThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('TL001', N'Sách', N'Kim Đồng', 30 , N'Nguyễn Nhật Ánh', 200, '50', '1', '5')

INSERT INTO QuanLyThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('TL002', N'Sách', N'Kim Đồng', '30', N'Nguyễn Nhật Ánh', '200', '50', '1', '5')

INSERT INTO QuanLyThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('TL003', N'Sách', N'Kim Đồng', '30', N'Nguyễn Nhật Ánh', '200', '50', '1', '5')

INSERT INTO QuanLyThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('TL004', N'Sách', N'Kim Đồng', '30', N'Nguyễn Nhật Ánh', '200', '50', '1', '5')


INSERT INTO QuanLyThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('TL005', N'Sách', N'Kim Đồng', '30', N'Nguyễn Nhật Ánh', '200', '50', '1', '5')

INSERT INTO QuanLyThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('TL006', N'Sách', N'Kim Đồng', '30', N'Nguyễn Nhật Ánh', '200', '50', '1', '5')

INSERT INTO QuanLyThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('TL007', N'Sách', N'Kim Đồng', '30', N'Nguyễn Nhật Ánh', '200', '50', '1', '5')

Select * from QuanLyThuVien

