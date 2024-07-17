import { BrowserRouter, Route, Routes } from 'react-router-dom'
import './App.css'
import Dashboard from './components/Dashboard'
import UserAnalytics from './components/UserAnalytics'

function App() {

  return (
    <div>
      <BrowserRouter>
      <Routes>
        <Route path='/' element={<Dashboard />} />
        <Route path='/users/:userId' element={<UserAnalytics />} />
      </Routes>
      </BrowserRouter>
    </div>
  )
}

export default App
