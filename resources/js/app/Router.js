import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";
import PageTeste from "./pages/PateTeste";
import ErrorPage from "./pages/ErrorPage";


function Router() {
    return (
    <BrowserRouter>
        <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/laboratorios" element={<PageTeste/>} />
            <Route path="/maquinas" element={<PageTeste/>} />
            <Route path="*" element={<ErrorPage />} />
        </Routes>
    </BrowserRouter>);
}

export default Router;