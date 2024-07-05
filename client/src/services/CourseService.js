import axios from 'axios'

const http = axios.create({
  baseURL: 'http://localhost:9000/wguswetransfercredits'
})

export default {
  list() {
    return http.get('/') // Retrieves all courses
  },

  update(id, course) {
    return http.put(`/${id}/completed`, course) // Updates completion status
  }
}
