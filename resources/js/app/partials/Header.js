import * as React from 'react';
import Box from '@mui/material/Box';
import IconButton from '@mui/material/IconButton';
import Typography from '@mui/material/Typography';
import Menu from '@mui/material/Menu';
import MenuIcon from '@mui/icons-material/Menu';
import Container from '@mui/material/Container';
import Button from '@mui/material/Button';
import MenuItem from '@mui/material/MenuItem';
import { AppBar, Toolbar } from "@mui/material";
import Image from "../../../images/bg-topo.png";
import LogoUNILAB from "../../../images/logo-unilab.png";
import styled from "styled-components";
import Link from '@mui/material/Link';



const ImageLogo = styled(({ color, ...otherProps }) => <img alt="Logo UNILAB" src={LogoUNILAB} {...otherProps} />)`
  width: 300px;
  padding: 30px;
`;

const styles = {
  paperContainer: {
    backgroundImage: `url(${Image})`,
  },
};


const style = {
  position: 'absolute',
  top: '50%',
  left: '50%',
  transform: 'translate(-50%, -50%)',
  width: 400,
  bgcolor: 'background.paper',
  border: '2px solid #000',
  boxShadow: 24,
  p: 4,
};


const Header = () => {
  const [anchorElNav, setAnchorElNav] = React.useState(null);
  const [openAbout, setOpenAbout] = React.useState(false);
  const handleOpenAbout = () => setOpenAbout(true);
  const handleCloseAbout = () => setOpenAbout(false);

  const [openContact, setOpenContact] = React.useState(false);
  const handleOpenContact = () => setOpenContact(true);
  const handleCloseContact = () => setOpenContact(false);

  const handleOpenNavMenu = (event) => {
    setAnchorElNav(event.currentTarget);
  };
  const handleCloseNavMenu = () => {
    setAnchorElNav(null);
  };

  return (
    <AppBar position="static" style={styles.paperContainer}>
      <Container maxWidth="xl">
        <Toolbar disableGutters>
          <ImageLogo />


          <Box sx={{ flexGrow: 1, display: { xs: 'flex', md: 'none' } }}>
            <IconButton
              size="large"
              aria-label="account of current user"
              aria-controls="menu-appbar"
              aria-haspopup="true"
              onClick={handleOpenNavMenu}
              color="inherit"
            >
              <MenuIcon />
            </IconButton>
            <Menu
              id="menu-appbar"
              anchorEl={anchorElNav}
              anchorOrigin={{
                vertical: 'bottom',
                horizontal: 'left',
              }}
              keepMounted
              transformOrigin={{
                vertical: 'top',
                horizontal: 'left',
              }}
              open={Boolean(anchorElNav)}
              onClose={handleCloseNavMenu}
              sx={{
                display: { xs: 'block', md: 'none' },
              }}
            >
              <Link href="/">
                <MenuItem>
                  <Typography textAlign="center">Início</Typography>
                </MenuItem>
              </Link>
              <Link href="/laboratorios">
                <MenuItem>
                  <Typography textAlign="center">Laboratórios</Typography>
                </MenuItem>
              </Link>
              <Link href="/maquinas">
                <MenuItem>
                  <Typography textAlign="center">Maquinas</Typography>
                </MenuItem>
              </Link>
            </Menu>
          </Box>


          <Box sx={{ flexGrow: 1, display: { xs: 'none', md: 'flex' } }}>
            <Link href="/">
              <Button
                sx={{ my: 2, color: 'white', display: 'block' }}
              >
                Início
              </Button>
            </Link>
            <Link href="/laboratorios">
              <Button
                sx={{ my: 2, color: 'white', display: 'block' }}
              >
                Laboratórios           
              </Button>
            </Link>
            <Link href="/maquinas">
              <Button
                sx={{ my: 2, color: 'white', display: 'block' }}
              >
                Máquinas
              </Button>
            </Link>

          </Box>


        </Toolbar>
      </Container>



    </AppBar>
  );
};
export default Header;