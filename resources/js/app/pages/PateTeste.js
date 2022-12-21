import { Typography, Container } from "@mui/material";
// import imagem from "../../assets/img/404.png";
// import styled from 'styled-components';

// const Image404 = styled.img`
//   margin-top: 5em;
//   width: 100%;
// `

function PageTeste() {
    return (<Container maxWidth="sm">
        {/* <Image404 src={imagem} alt="nao encontrada" /> */}
        <Typography
            component="h1"
            variant="h4"
            align="center"
            color="textPrimary"
            gutterBottom
        >
            Page Teste
        </Typography>
    </Container>);
}

export default PageTeste;